package com.zq.springboot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 曾权
 * @create 2021-08-20-14:32
 */
@SpringBootApplication
@EnableConfigServer
public class Strat_Config_File_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Strat_Config_File_3344.class,args);
    }
}
