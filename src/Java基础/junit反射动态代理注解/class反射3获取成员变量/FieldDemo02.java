package Java基础.junit反射动态代理注解.class反射3获取成员变量;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo02 {
    @Test
    public void setField() throws Exception{
        Class c=Student.class;
        Field ageF =c.getDeclaredField("age");
        ageF.setAccessible(true);
        //赋值
        Student student=new Student();
        ageF.set(student,18);

        System.out.println(student);
        //取值
        int age =(int) ageF.get(student);
        System.out.println(age);
    }
}
