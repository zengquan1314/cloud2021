package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 曾权
 * @create 2021-08-19-9:31
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class Star_Eureka_Server_7002 {
    public static void main(String[] args) {
        SpringApplication.run(Star_Eureka_Server_7002.class,args);
    }
}
