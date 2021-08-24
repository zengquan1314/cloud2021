package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 曾权
 * @create 2021-08-20-20:10
 */
@SpringBootApplication
@EnableEurekaClient

public class Start_Stream_8802 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Stream_8802.class,args);
    }
}
