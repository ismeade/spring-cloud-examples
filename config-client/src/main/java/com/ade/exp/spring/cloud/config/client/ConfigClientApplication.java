package com.ade.exp.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyang on 18-1-24.
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${message}")
    private String foo;

    @Value("${test}")
    private String test;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo + " " + test;
    }

}
