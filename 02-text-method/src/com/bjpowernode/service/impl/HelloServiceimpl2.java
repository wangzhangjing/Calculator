package com.bjpowernode.service.impl;

import com.bjpowernode.service.HelloService;

public class HelloServiceimpl2 implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("发给别人是不如跳舞你好："+name);

    }
}
