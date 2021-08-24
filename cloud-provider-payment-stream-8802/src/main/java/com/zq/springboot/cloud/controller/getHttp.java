package com.zq.springboot.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**@EnableBinding(Sink.class) 接受通道绑定
 * @StreamListener(Sink.INPUT) 开启监听
 * message 通道返回的值
 * studyExchange 通道名称，在application.yml中字段名为destination定义的
 * 如果有集群，不分组，则会产生重复消费，不分组，当服务挂掉后，会丢失数据，分组在application.yml 中定义
 * @author 曾权
 * @create 2021-08-20-22:28
 */
@Component
@EnableBinding(Sink.class)
public class getHttp {
    @Value("${server.port}")
    String port;
    @StreamListener(Sink.INPUT)
    public void getsend(Message<Object> message){
        System.out.println("我是服务器"+port);
        System.out.println( "收到===========>"+message.getPayload());
    }
}
