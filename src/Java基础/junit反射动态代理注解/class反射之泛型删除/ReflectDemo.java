package Java基础.junit反射动态代理注解.class反射之泛型删除;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectDemo {
    public static void main(String[] args)throws Exception{
        ArrayList<String> lusts =new ArrayList<>();
        ArrayList<Integer> lusts2 =new ArrayList<>();

        System.out.println(lusts.getClass()==lusts2.getClass());
        System.out.println("---------------------");

        lusts2.add(23);
        lusts2.add(24);

        Class c=lusts2.getClass();//arrayList.class ==>public boolean add(E e)
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean o = (boolean) add.invoke(lusts2, "嗡嗡嗡");
        System.out.println(o);
        System.out.println(lusts2);
        //2\
        ArrayList list =lusts2;
        list.add("啵啵啵");
        list.add(false);
        System.out.println(list
        );
    }
}
