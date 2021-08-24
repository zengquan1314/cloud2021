package com.zq.springboot.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-20-15:54
 */
@RestController
@RefreshScope
public class ClientController {
    @Value("${config.address}")
    String str;
    @RequestMapping(value = "client/get/")
    public  String get(){
        return  str;
    }
}
