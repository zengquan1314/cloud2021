package com.zq.springboot.cloud.controller;

import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
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
public class RestTemplateController {
    private static final  String  localhosturl="http://consul-provide-payment";
    @Autowired
    RestTemplate restTemplateConfig;
    @RequestMapping("consumer/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") String id) {
        System.out.println(localhosturl+"/payment/get/"+id);
        return restTemplateConfig.postForObject(localhosturl+"/consul/payment/get/"+id,"", CommonResult.class);
    }

    @RequestMapping("consumer/add")
    public CommonResult<Payment> add(Payment payment) {
        System.out.println(localhosturl+"/payment/add/"+payment);
        return restTemplateConfig.postForObject(localhosturl+"/consul/payment/add", payment, CommonResult.class);
    }
    @RequestMapping("consumer/get/client")
    public CommonResult<Payment> getclient() {
        return restTemplateConfig.postForObject(localhosturl+"/consul/payment/client", "", CommonResult.class);
    }
}
