package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 曾权
 * @create 2021-08-19-18:18
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zq"})//feign接口文件所在地点。cloud-api-commons服务下的com.zq包
@EnableHystrix
public class Start_Consumer_OpenFeign_Hystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Consumer_OpenFeign_Hystrix80.class,args);
    }
}
