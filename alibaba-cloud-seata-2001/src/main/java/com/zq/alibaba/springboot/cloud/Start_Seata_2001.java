package com.zq.alibaba.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 曾权
 * @create 2021-08-23-18:1The web application [ROOT] appears to have started a thread named [com.alibaba.nacos.naming.push.receiver] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:7
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Start_Seata_2001 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Seata_2001.class,args);
    }
}
