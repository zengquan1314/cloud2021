package com.zq.springboot.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import com.zq.springboot.cloud.emit.openfeigservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-18-22:47
 */
@RestController
public class OpenFeignHystrixController {
    @Autowired
    PaymentService paymentService;
    @RequestMapping("consumer/openfeign/hystrix/get/{id}")
    @HystrixCommand(fallbackMethod = "getfallback",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"), //是否开启熔断断路器
            @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//窗口期时间，这里是10秒
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value ="60" )//失败率达到多少后跳闸
    })
    public CommonResult<Payment> get(@PathVariable("id") String id) {
        System.out.println(id);
        if(id.equals("2")){
           throw new RuntimeException("11");
        }
     //   System.out.println(localhosturl+"/payment/get/"+id);
        return paymentService.get(id);
    }
    public CommonResult<Payment> getfallback(@PathVariable("id") String id) {

        return  new CommonResult(555, "服务器繁忙，请稍后在试一试");
    }
    @RequestMapping("consumer/openfeign/hystrix/add")
    public CommonResult<Payment> add(Payment payment) {
       // System.out.println(localhosturl+"/payment/add/"+payment);
        return paymentService.add(payment);
    }
    @RequestMapping("consumer/openfeign/hystrix/get/client")
    public CommonResult<Payment> getclient() {
        return paymentService.cliceString();
    }
}
