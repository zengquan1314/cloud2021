package com.zq.springboot.cloud;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 曾权
 * @create 2021-08-18-17:53
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.zq.*"})
@EnableDiscoveryClient
public class Start_Consul_8006 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Consul_8006.class);
    }
}
