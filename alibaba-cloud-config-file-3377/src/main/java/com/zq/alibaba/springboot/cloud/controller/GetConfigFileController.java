package com.zq.alibaba.springboot.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-21-18:47
 */
@RestController
@RefreshScope
public class GetConfigFileController {
    @Value("${config.info}")
    String configvalue;
    @RequestMapping(value="config/get")
    public  String  getConfigFileValue(){
        return configvalue;
    }
}
