package com.pengyuyan.trxy_demo.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//我们需要接收前端传回的参数，所以要标记此类为“控制器”，数据传输节点
//能够接收与返回前端数据的标记--也就是注解
@RestController
public class demo01 {

    //String 返回值类型是字符串类型
    //@RequestMapping("/d1") 定义唯一的网络访问路径
    //@RequestBody 作用是改变数据读取位置，改变到请求体中
    @RequestMapping("/d1")
    public String demo1(@RequestBody Info info){
        System.out.println("前端传入的数据:"+info.getMsg());
        System.out.println("前端传入的数据:"+info.getName());
        System.out.println("前端传入的数据:"+info.getAge());
        //向前端返回数据
        if(info.getMsg().equals("天王盖地虎")){
            return "宝塔镇河妖";
        }
        return "目前还需要学习";
    }



}
