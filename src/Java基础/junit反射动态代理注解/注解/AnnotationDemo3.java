package Java基础.junit反射动态代理注解.注解;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 完成注解的解析
 */
public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        //先得到类对象
        Class c=BookStore.class;
        //判断这个类上是否有注解
        if (c.isAnnotationPresent(Bookk.class)){
            //直接获取该注解对象
            Bookk book =(Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(book.author());
            System.out.println(Arrays.toString(book.author()));

        }
    }
    @Test
    public void parseMethod() throws NoSuchMethodException {

        //先得到类对象
        Class c=BookStore.class;
        Method m=c.getDeclaredMethod("test");
        //判断这个类上是否有注解
        if (m.isAnnotationPresent(Bookk.class)){
            //直接获取该注解对象
            Bookk book =(Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(book.author());

        }
    }

}
@Bookk(value = "<情深深雨蒙蒙>",price = 99.9,author = {"琼瑶","地雷"})
class BookStore{
    @Bookk(value = "<三十一的贱>",author = "戴菲菲")
    public void test(){

    }
}