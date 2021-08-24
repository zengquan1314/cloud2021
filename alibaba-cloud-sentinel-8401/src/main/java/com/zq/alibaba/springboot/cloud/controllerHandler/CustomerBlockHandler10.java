package com.zq.alibaba.springboot.cloud.controllerHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zq.springboot.cloud.emit.CommonResult;
import com.zq.springboot.cloud.emit.Payment;

/**
 * @author 曾权
 * @create 2021-08-22-13:47
 */
public class CustomerBlockHandler10 {
    public static String getSentinelHandler1(BlockException BlockException){
        return "这是getSentinel函数兜底的异常，系统异常，请稍后再试"+BlockException+"";
    }
    public static CommonResult handlerException2(BlockException BlockException)
    {
        return new CommonResult(200,"按客戶自定义111",new Payment(2020,"serial003"));
    }
}
