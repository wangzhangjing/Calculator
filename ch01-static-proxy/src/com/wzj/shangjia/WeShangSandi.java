package com.wzj.shangjia;


import com.wzj.factory.UsbSanFactory;
import com.wzj.service.UsbSell;

public class WeShangSandi implements UsbSell {
    //代理闪迪，定义目标厂家类

    private UsbSanFactory facotory = new UsbSanFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = facotory.sell(amount);
        //只增加1元
        price=price+1;
        return price;
    }
}
