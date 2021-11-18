package com.ade.exp.spring.cloud.eureka.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyang on 17-10-13.
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi_feign", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name, @RequestParam Integer age){
        System.out.println("sayHi");
        return schedualServiceHi.sayHiFromClientOne(name, age);
    }

}
