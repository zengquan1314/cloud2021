package com.zq.springboot.cloud.service.controller;

import com.zq.springboot.cloud.service.SendHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author 曾权
 * @create 2021-08-20-21:48
 */
@RestController
public class SetHttp {
    @Autowired
    SendHttp sendHttp;
    @RequestMapping(value="add/{str}")
    public Object setmsg(@PathVariable("str") String str){
    return sendHttp.send(str);
    }
}
