package com.wzj.factory;

import com.wzj.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //目标方法
        float s =85.0f;
        System.out.println("目标类中执行目标方法");
        return s*amount;
    }
}
