package com.wzj.factory;

import com.wzj.service.UsbSell;

//目标类闪迪,不接受用户单独购买。
public class UsbSanFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("  闪迪 目标类中的方法调用，UsbSanFactory中的sell");
        //一个128g的U盘是85元
        //后期可以根据amount数量实现不同价格如  10000个单价80 50000个单价75
        return 85.0f;
    }
}
