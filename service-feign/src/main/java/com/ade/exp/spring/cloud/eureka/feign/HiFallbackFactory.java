package com.ade.exp.spring.cloud.eureka.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HiFallbackFactory implements FallbackFactory<SchedualServiceHi> {

    private final SchedualServiceHiHystric schedualServiceHiHystric;

    public HiFallbackFactory(SchedualServiceHiHystric schedualServiceHiHystric) {
        this.schedualServiceHiHystric = schedualServiceHiHystric;
    }

    @Override
    public SchedualServiceHi create(Throwable throwable) {
        System.out.println(throwable.getMessage());
//        throwable.printStackTrace();
        return schedualServiceHiHystric;
    }

}
