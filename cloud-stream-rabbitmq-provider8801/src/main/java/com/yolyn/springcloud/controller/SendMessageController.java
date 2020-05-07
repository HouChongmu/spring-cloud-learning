package com.yolyn.springcloud.controller;

import com.yolyn.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 11:03
 * @project springcloud-2020
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider messageProvider;
    @GetMapping("/sendMessage")
    public String createMesage(){
        return messageProvider.send();
    }
}
