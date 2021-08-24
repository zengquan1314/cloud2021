package com.zq.springboot.cloud.controller;

import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import com.zq.springboot.cloud.emit.openfeigservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 曾权
 * @create 2021-08-18-22:47
 */
@RestController
public class OpenFeignController {
    @Autowired
    PaymentService paymentService;
    @RequestMapping("consumer/openfeign/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") String id) {
     //   System.out.println(localhosturl+"/payment/get/"+id);
        return paymentService.get(id);
    }

    @RequestMapping("consumer/openfeign/add")
    public CommonResult<Payment> add(Payment payment) {
       // System.out.println(localhosturl+"/payment/add/"+payment);
        return paymentService.add(payment);
    }
    @RequestMapping("consumer/openfeign/get/client")
    public CommonResult<Payment> getclient() {
        return paymentService.cliceString();
    }
}
