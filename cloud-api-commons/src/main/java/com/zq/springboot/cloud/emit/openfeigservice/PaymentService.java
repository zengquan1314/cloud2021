package com.zq.springboot.cloud.emit.openfeigservice;

import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 曾权
 * @create 2021-08-19-18:09
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback =PaymentServiceFallBack.class )
public interface PaymentService {
    @PostMapping(value = "payment/get/{id}")
    public CommonResult get(@PathVariable("id") String id);
    @PostMapping(value = "payment/add")
    public CommonResult add(@RequestBody Payment payment);
    @RequestMapping(value = "payment/client")
    public CommonResult cliceString();
}
