package com.zq.springboot.cloud.resttemplateconfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

/**
 * @author 曾权
 * @create 2021-08-18-22:44
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate RestTemplateConfig() {

        RestTemplate restTemplate = new RestTemplate();
        StringHttpMessageConverter t = new StringHttpMessageConverter();
    //设置为false就可以修改header中的accept-charset属性
        t.setWriteAcceptCharset(false);
        t.setDefaultCharset(StandardCharsets.UTF_8);
        restTemplate.getMessageConverters().add(0,t);
        return restTemplate;
    }
}
