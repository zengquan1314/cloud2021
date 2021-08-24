package com.zq.alibaba.springboot.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-21-17:09
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value="payment/get")
    public  String getPort(){
        return "端口号为:"+port;
    }
}
