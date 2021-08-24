package com.zq.alibaba.springboot.cloud.controller;

import com.zq.alibaba.springboot.cloud.emit.Order;
import com.zq.alibaba.springboot.cloud.emit.RestResult;
import com.zq.alibaba.springboot.cloud.service.OderService;
import com.zq.alibaba.springboot.cloud.service.OrderServerImpl.OrderServerImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾权
 * @create 2021-08-23-20:19
 */
@RestController
public class OredrController {
    @Autowired
    OrderServerImpl OrderServerImpl;
    @PostMapping(value = "oredr/add")
    @GlobalTransactional(name = "tx_group",rollbackFor = Exception.class)
    public RestResult add(@RequestBody Order order){
        System.out.println(order);

        OrderServerImpl.insertOrder(order);



       return new RestResult("200","成功","成功 ");
    }
}
