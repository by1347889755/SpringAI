package com.pengyuyan.trxy_demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class ChatController {

    //自动注入对象
    @Autowired
    ChatClient chatClient;
    //http://localhost:8088/ai/chat?prompt=你是谁
    @RequestMapping(value="/chat",produces = "text/html;charset=utf-8")
    public Flux<String> chat(String prompt){
        return chatClient.prompt().user(prompt).stream().content();
    }


}
