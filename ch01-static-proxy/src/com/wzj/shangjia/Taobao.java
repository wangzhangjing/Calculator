package com.wzj.shangjia;

import com.wzj.factory.UsbKingFactory;
import com.wzj.service.UsbSell;
//淘宝taobao是一个商家，代理金士顿U盘的销售
public class Taobao implements UsbSell {
    //声明商家的厂家具体是谁
    private UsbKingFactory  facotory = new UsbKingFactory();
    @Override
    //实现销售U盘的功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买U盘，厂家发货
        float price = facotory.sell(amount);//厂家价格
        //商家需要加价，代理需要增加价格
        price = price+25;//增强功能，代理类他在完成目标类方法调用后增强了功能
        //在目标类方法调用后你做的其他功能但是增强的意思
        //返回增加的价格
        System.out.println("淘宝商家，给你返回一个红包");//增强功能
        return price;

    }
}
