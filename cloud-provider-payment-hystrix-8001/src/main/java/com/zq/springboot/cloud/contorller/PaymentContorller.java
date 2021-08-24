package com.zq.springboot.cloud.contorller;

import com.alibaba.fastjson.JSONObject;
import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import com.zq.springboot.cloud.server.Impl.PaymentServerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 曾权
 * @create 2021-08-18-18:55
 */
@RestController
@Slf4j
public class PaymentContorller {
    @Autowired
    PaymentServerImpl paymentServerImpl;
    @Autowired
    DiscoveryClient client;


    /*@PostMapping(value = "payment/get/{id}")
    public Payment get(@PathParam("id") long id){
        Payment payment = paymentServerImpl.get(id);
        log.info(payment.toString());
        if (payment != null) {
           // commonResult.setCode(1).setData(payment);
        }else {
           // commonResult.setCode(0).setMessage("不存在");
        }

        return  payment;
    }*/
    @PostMapping(value = "payment/get/{id}")
    public CommonResult get(@PathVariable("id") int id){


        Payment payment = paymentServerImpl.get(id);
        System.out.println(payment);
        log.info(payment.toString());
        if (payment != null) {
            return new CommonResult(1,"查询成功,8001端口",payment);
        }else {
             return new CommonResult(0,"此ID不存在");
        }
    }
   @PostMapping(value = "payment/add")
    public CommonResult add(@RequestBody Payment payment){
       int i=paymentServerImpl.add(payment);
       log.info("  "+i);
       if (i <=1) {
           return new CommonResult(1,"添加成功",payment);
       }else{
           return new CommonResult(0,"添加失败");
       }
    }
    /*
     * eureka发现微服务
     *
     * */
    @RequestMapping(value = "payment/client")
    public CommonResult cliceString() {
        List<String> clients=client.getServices();
        JSONObject js=new JSONObject();
        for (String clientName : clients) {
            JSONObject jsonName=new JSONObject();
            for (ServiceInstance clientValue : client.getInstances(clientName)) {
                jsonName.put("microserviceName", clientValue.getServiceId());
                jsonName.put("microserviceIP", clientValue.getHost());
                jsonName.put("microservicePort", clientValue.getPort());
                jsonName.put("microserviceUrl", clientValue.getUri());
                jsonName.put("microserviceData", clientValue.getMetadata());
            }
            js.put(clientName, jsonName);
        }
        if (js !=null) {
            return new CommonResult(1,"查询成功，端口8001",js);
        }else{
            return new CommonResult(0,"查询失败");
        }
    }
}
