package com.wzj;

import com.wzj.shangjia.Taobao;
import com.wzj.shangjia.WeShang;
import com.wzj.shangjia.WeShangSandi;

public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家taobao对象
//        Taobao taobao = new Taobao();
//        float price = taobao.sell(1);
//        System.out.println("通过淘宝的商家购买U盘单价："+price+"元");
        //用weshang
        WeShangSandi weShang=new WeShangSandi();
        float price=weShang.sell( 6);
        System.out.println("通过微商购买的价格:"+price);




    }
}
