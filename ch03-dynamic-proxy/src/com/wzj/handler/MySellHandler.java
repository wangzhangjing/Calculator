package com.wzj.handler;

import com.wzj.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellHandler implements InvocationHandler {
    //动态代理必须实现InvocationHandler ，接口，完成代理类要完成的功能1，调用目标方法2 实现功能增强
    private Object ww =null;

    public MySellHandler(Object ww) {
        this.ww = ww;
    }


    //动态代理，目标是活动的，不是固定的，需要传入进来
    //传入谁就给谁创建代理


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        Object re =null;
        //向厂家发送订单，告诉厂家，我买U盘，厂家发货
//        float price = facotory.sell(amount);//厂家价格
        re=method.invoke(ww,args);//执行目标方法

        //商家需要加价，代理需要增加价格
//        price = price+25;//增强功能，代理类他在完成目标类方法调用后增强了功能
        if (re != null){
            Float i= (Float)re/85;
            Float price = (Float) re;
            price = price+25*i;
            re=price;
        }

        //在目标类方法调用后你做的其他功能但是增强的意思
        //返回增加的价格
        System.out.println("淘宝商家，给你返回一个红包");//增强功能
        return re;

    }
}
