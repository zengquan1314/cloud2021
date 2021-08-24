package com.zq.alibaba.springboot.cloud.controller;

import com.zq.alibaba.springboot.cloud.emit.Order;
import com.zq.alibaba.springboot.cloud.emit.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-23-20:19
 */
@RestController
public class OredrController {

    @PostMapping(value = "oredr/add")
    public RestResult add(@RequestBody Order order){
        System.out.println(order);
     //  OderService.insertOrder(order);
        return new RestResult("200","成功","成功1 ");
    }
}
