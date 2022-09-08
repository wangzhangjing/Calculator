package Java基础.test8设计模式链表jdk8表达式;

import java.io.Serializable;
//饿汉式
public class test5 implements Serializable {
//    private test5(){
//        System.out.println("private test5()");
//    }
    private static final test5 INSTANCE=new test5();

    public static test5 getInstance(){
        return INSTANCE;
    }
    public static void otherMethod(){
        System.out.println("otherMethod()");
    }
}
