package Java基础.junit反射动态代理注解.class反射2获取构造器;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent01 {
    @Test
    public void getConstructors(){
        //1获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象
        Constructor[] constructors = c.getConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());
        }
    }

    @Test//获取全部构造器，可以拿private的
    public void getEetlaredConstructors(){
        //1获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());
        }
    }
    @Test//获取单个构造器
    public void getConstructor() throws Exception {
        //1获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象//获取无参构造器
        Constructor cons = c.getConstructor();

            System.out.println(cons.getName()+"===>"+cons.getParameterCount());

    }
    @Test//获取单个构造器
    public void getEetlaredConstructor() throws Exception {
        //1获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象//获取无参构造器
        Constructor cons11 = c.getDeclaredConstructor();
        System.out.println(cons11.getName()+"===>"+cons11.getParameterCount());
        Constructor cons = c.getDeclaredConstructor(String.class,int.class);

        System.out.println(cons.getName()+"===>"+cons.getParameterCount());

    }
}
