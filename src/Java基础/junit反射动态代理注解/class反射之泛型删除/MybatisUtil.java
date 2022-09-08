package Java基础.junit反射动态代理注解.class反射之泛型删除;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /**
    * 保存任意类型对象
     *
    * */
    public static void save(Object obj){
        try ( PrintStream ps =new PrintStream(new FileOutputStream("D:/app/workspace/Calculator/src/data.txt",true));)
        {


            //1.提前这个对象的全部成员变量，只有反射才能解决
            Class c =obj.getClass();
            ps.println("======"+c.getSimpleName()+"==========");
            //2提前它的全部成员变量
            Field[] fields=c.getDeclaredFields();
            //3获取成员变量的信息
            for (Field field : fields) {
                String name =field.getName();
                //提取本成员变量在obj对象的值
                field.setAccessible(true);
                String o = field.get(obj)+"";
                ps.println(name +"="+o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
