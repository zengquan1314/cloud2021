package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 曾权
 * @create 2021-08-18-22:41
 */
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE")
@EnableDiscoveryClient
public class Start_Consumer_Consul80 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Consumer_Consul80.class,args);
    }
}
