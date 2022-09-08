package Java基础.test6抽象接口继承线程;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {
        Map<String,String> a =new HashMap<String,String>();
//添加
        a.put("张无忌","赵敏");
        a.put("郭靖","黄蓉");
        a.put("杨过","小龙女");
        //remove移除
//        System.out.println(a.remove("郭靖"));
//        System.out.println(a.remove("郭"));
        // a.clear();全部移除
//        a.clear();
        //containsKey是否包含郭靖
//        System.out.println(a.containsKey("郭靖"));
        //a.isEmpty();判断是否为空
//        boolean empty = a.isEmpty();
        //a.size()查看长度
        System.out.println(a.size());
        System.out.println(a);
    }
}
