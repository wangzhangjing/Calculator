package Java基础.junit反射动态代理注解.class反射3获取成员变量;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo01 {
    @Test
    public void getDeclaredFields(){
        Class c=Student.class;
        //定位全部成员变量
        Field[] fields=c.getDeclaredFields();
        //遍历一下
        for (Field field : fields) {
            System.out.println(field.getName()+"===>"+field.getType());
        }
    }
    @Test
    public void getDeclaredField() throws Exception {
        Class c=Student.class;
        //定位一个成员变量
        Field f=c.getDeclaredField("age");
        System.out.println(f.getName()+"====>"+f.getType());
    }
}
