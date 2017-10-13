package com.ade.exp.spring.cloud.eureka.feign;

import org.springframework.stereotype.Component;

/**
 * Created by liyang on 17-10-13.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
