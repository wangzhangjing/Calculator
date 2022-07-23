package com.wzj;

import com.wzj.factory.UsbKingFactory;
import com.wzj.handler.MySellHandler;
import com.wzj.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用proxy
        //1创建目标对象,,,1    private UsbSanFactory  facotory = new UsbSanFactory();也是可以
        UsbSell factory = new UsbKingFactory();
        //2创建InvocationHandler对象
        InvocationHandler ha =new MySellHandler(factory);
        //
        //3创建代理对象
        UsbSell proxy =(UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                ha);
        //4通过代理执行方法
        float price = proxy.sell(3);
        System.out.println("通过动态代理对象调用方法："+price);
    }
}
