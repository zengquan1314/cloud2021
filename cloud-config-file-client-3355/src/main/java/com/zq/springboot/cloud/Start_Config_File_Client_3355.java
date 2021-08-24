package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 曾权
 * @create 2021-08-20-15:51
 */
@SpringBootApplication
@EnableEurekaClient
public class Start_Config_File_Client_3355 {
    public static void main(String[] args) {
        SpringApplication.run(Start_Config_File_Client_3355.class,args);
    }
}
