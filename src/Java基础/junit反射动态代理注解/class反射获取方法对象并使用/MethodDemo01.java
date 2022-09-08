package Java基础.junit反射动态代理注解.class反射获取方法对象并使用;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodDemo01 {
    @Test
    public void getDeclareMethods(){
        Class s=Dog.class;
        //提取全部方法，包括私有的
        Method[] methods = s.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+" 返回值类型："+method.getReturnType()+" 参数个数："+method.getParameterCount());
        }
    }
    @Test
    public void getDeclareMethod() throws Exception{
        Class s=Dog.class;
        //提取一个方法，包括私有的

        Method m=s.getDeclaredMethod("eat");
        Method m1=s.getDeclaredMethod("eat", String.class);
        m.setAccessible(true);
        //方法的执行
        Dog d=new Dog();
        Object invoke = m.invoke(d);//方法如果没有返回结果，那么返回的是null
        System.out.println(invoke);
        m1.setAccessible(true);
        Object result = m1.invoke(d, "骨头");
        System.out.println(result);
    }
}
