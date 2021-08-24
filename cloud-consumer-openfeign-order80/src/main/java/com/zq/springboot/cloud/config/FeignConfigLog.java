package com.zq.springboot.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 曾权
 * @create 2021-08-19-19:18
 */
@Configuration
public class FeignConfigLog {
    @Bean
    Logger.Level feigLoggerLevel(){
        return Logger.Level.FULL;
    }
}
