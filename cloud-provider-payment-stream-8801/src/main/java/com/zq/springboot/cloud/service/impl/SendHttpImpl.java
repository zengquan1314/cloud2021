package com.zq.springboot.cloud.service.impl;

import com.zq.springboot.cloud.service.SendHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author 曾权
 * @create 2021-08-20-21:40
 */
@Component
@EnableBinding(Source.class) //绑定通道
public class SendHttpImpl implements SendHttp {
    @Autowired
    private MessageChannel output; //output发送数据
    @Value("${server.port}")
    String port;

    /***
     * @EnableBinding(Source.class) 绑定通道
     *通道名字在application.yml 中属性名 destination
     * 通道名字是 tudyExchange
     * output发送数据
     * @param str
     * @return
     */
    @Override
    public Object send(String str) {
        System.out.println("我是客户端"+port);
        System.out.println("发送==========>"+str);
        Object o=output.send(MessageBuilder.withPayload(str).build());
        return o;
    }
}
