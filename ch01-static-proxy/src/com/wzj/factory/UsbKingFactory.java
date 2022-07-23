package com.wzj.factory;

import com.wzj.service.UsbSell;
//目标类金士顿,不接受用户单独购买。
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法调用，UsbKingFactory中的sell");
        //一个128g的U盘是85元
        //后期可以根据amount数量实现不同价格如  10000个单价80 50000个单价75
        return 85.0f;
    }
}
