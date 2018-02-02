package com.ade.exp.spring.cloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by liyang on 18-1-30.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        TimeUnit.SECONDS.sleep(20);
        SinkReceiver receiver = context.getBean(SinkReceiver.class);
        receiver.send();
    }

}
