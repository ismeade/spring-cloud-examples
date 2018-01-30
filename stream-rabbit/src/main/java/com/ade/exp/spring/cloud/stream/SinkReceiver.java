package com.ade.exp.spring.cloud.stream;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;

import java.io.IOException;

/**
 * Created by liyang on 18-1-30.
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    /** 一条消息抛出3次异常后 将被消费掉 配置 maxAttempts */
    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message,
                        @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, // 手动ack
                        @Header(AmqpHeaders.CHANNEL) Channel channel
    ) throws IOException {
        try {
            System.out.println("Received: " + message.getPayload());

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            channel.basicAck(deliveryTag,false); // 手动ack
        }
    }

}
