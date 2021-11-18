package com.ade.exp.spring.cloud.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liyang on 17-10-13.
 */
@FeignClient(value = "service-hi",
//        fallback = SchedualServiceHiHystric.class
        fallbackFactory = HiFallbackFactory.class
)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name, @RequestParam("age") Integer age);
//    String sayHiFromClientOne(@RequestParam("name") String name, @RequestParam("age") Integer age);

}
