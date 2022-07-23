package com.bjpowernode;

import com.bjpowernode.service.HelloService;
import com.bjpowernode.service.impl.HelloServiceimpl;
import com.bjpowernode.service.impl.HelloServiceimpl2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testapp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloService service=new HelloServiceimpl();
//        service.sayHello("张三");
        //使用反射机制执行sayHello方法。核心Method（类中方法）
        HelloService tar = new HelloServiceimpl();
        //获取sayhello名称对于method类对象
        Method meth = HelloService.class.getMethod("sayHello", String.class);
        //通过method可以执行sayhello方法调用
        //invoke是method类中的一个方法的调用
        //参数1object ，表示对象的，要执行的对象方法
        // 参数2   args 表示方法执行的参数值
        //object 方法执行后的返回值
        //表达的意思是我们要执行tar对象sayhello，参数是张三
        meth.invoke(tar,"张三");

        HelloService qq = new HelloServiceimpl2();
        Method meth1 = HelloService.class.getMethod("sayHello", String.class);
        meth1.invoke(qq,"张三");
    }
}
