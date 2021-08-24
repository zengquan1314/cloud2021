package com.zq.alibaba.springboot.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zq.alibaba.springboot.cloud.controllerHandler.CustomerBlockHandler10;
import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-21-23:10
 */
@RestController
public class SentinelController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "sentinel/get/{str}")
    @SentinelResource(value = "getSentinel", //设置属性连接名
            blockHandler = "getSentinelHandler1") //限流异常后，走兜底函数
    public String getSentinel(@PathVariable("str") String str) {
        return "这是我自己请求的参数";
    }
    //如果getSentinel函数收到限流访问响应异常，这个函数是用来处理兜底的
    public static String getSentinelHandler1(BlockException BlockException){
        return "这是getSentinel函数兜底的异常，系统异常，请稍后再试"+BlockException+"";
    }

    @RequestMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler1", //设置属性连接名
            blockHandlerClass = CustomerBlockHandler10.class, //handlerException2兜底函数在这个class类里面定义，这里指的引用这个class
            blockHandler = "handlerException2")//customerBlockHandler函数受到限流访问异常，则会走 handlerException2函数方法。
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按客戶自定义", new Payment(2020, "serial003"));
    }

}

