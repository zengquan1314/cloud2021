package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 曾权
 * @create 2021-08-20-11:01
 */
@SpringBootApplication
@EnableEurekaClient
public class Start_Gateway_9527 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Gateway_9527.class,args);
    }
}
