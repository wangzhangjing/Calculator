package com.wzj.shangjia;

import com.wzj.factory.UsbKingFactory;
import com.wzj.service.UsbSell;

public class WeShang implements UsbSell {
    //代理金士顿，定义目标厂家类

    private UsbKingFactory facotory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = facotory.sell(amount);
        //只增加1元
        price=price+1;
        return price;
    }
}
