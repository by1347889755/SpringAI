package com.pengyuyan.trxy_demo.demo;
//前端传回的数据类型要和后端一致
//前端传回的是一个对象，那么后端就必须也是一个对象
//注意，对象中的参数需要一致
public class Info {

    String msg;
    String name;
    int age;

    public String getMsg() {
        return msg; //返回当前msg的值
    }

    public void setMsg(String msg) {
        this.msg = msg;//将传入的变量值赋给当前类中的msg
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
