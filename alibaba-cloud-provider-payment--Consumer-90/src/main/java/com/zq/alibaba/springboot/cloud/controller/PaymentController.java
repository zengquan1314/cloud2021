package com.zq.alibaba.springboot.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 曾权
 * @create 2021-08-21-17:09
 */
@RestController
public class PaymentController {
    @Value("${server_url.url}")
    String url;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value="/consumer/payment/get/{str}")
    public  String getPort(@PathVariable("str") String str){
    return restTemplate.postForObject(url+"/payment/get", str, String.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplateConfig(){
        return new RestTemplate();
    }
}
