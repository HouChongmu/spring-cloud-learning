package com.yolyn.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 11:34
 * @project springcloud-2020
 */
@Component("myBMQConsumer")
@EnableBinding(Sink.class)
public class MessageConsumer {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void consumeMsg(Message<String> message) {
        System.out.println("消费者2号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);

    }
}
