package com.pengyuyan.trxy_demo.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//将此类标记为项目配置类，在项目启动时自动生效
@Configuration
public class CommonConfiguration {

    @Bean
    public ChatClient chatClient(OpenAiChatModel  model) {

        /*
        * 开发极简版前端页面，（能够显示ai回复内容，以及用户能够输入内容，并且提交即可）*/

        return ChatClient
                .builder(model)
                //设定系统提示词
                .defaultSystem("你是一个善良、天真、可爱的秘书，你的名字叫小甜甜，请以小甜甜的身份回答我的问题，最好是夹子音")
                .build();
    }

}
