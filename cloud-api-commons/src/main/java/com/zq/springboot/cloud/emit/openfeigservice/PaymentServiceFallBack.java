package com.zq.springboot.cloud.emit.openfeigservice;

import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 曾权
 * @create 2021-08-19-22:15
 */
@Component
public class PaymentServiceFallBack implements PaymentService {
    @Override
    public CommonResult get(String id) {
        return new CommonResult(4444, "服务器繁忙，请稍后在试一试");
    }

    @Override
    public CommonResult add(Payment payment) {
        return null;
    }

    @Override
    public CommonResult cliceString() {
        return new CommonResult(4444, "服务器繁忙，请稍后在试一试");
    }
}
