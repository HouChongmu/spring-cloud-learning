package com.yolyn.springcloud.service.impl;

import com.yolyn.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 11:06
 * @project springcloud-2020
 */
@EnableBinding(Source.class) //定义消息的推送管道
@Component
public class MessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;// 消息发送管道
    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial:"+serial);
        return serial;
    }
}
