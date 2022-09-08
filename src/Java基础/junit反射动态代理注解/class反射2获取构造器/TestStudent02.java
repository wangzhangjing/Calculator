package Java基础.junit反射动态代理注解.class反射2获取构造器;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent02 {
    @Test//获取单个构造器
    public void getDeclaredConstructor() throws Exception {
        //1获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象//获取无参构造器
        Constructor cons11 = c.getDeclaredConstructor();
        System.out.println(cons11.getName()+"===>"+cons11.getParameterCount());

        //如果遇到私有的构造器，可以暴力反射
        cons11.setAccessible(true);//打开权限

        Student s = (Student) cons11.newInstance();
        System.out.println(s);


        Constructor cons = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(cons.getName()+"===>"+cons.getParameterCount());
        Student q = (Student)cons.newInstance("孙悟空",1000);
        System.out.println(q);
    }
}
