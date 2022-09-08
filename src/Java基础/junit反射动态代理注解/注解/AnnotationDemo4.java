package Java基础.junit反射动态代理注解.注解;

import java.lang.reflect.Method;

/**
 * 认识元注解
 *
 */
//@MyTest //只能注解方法和成员变量
public class AnnotationDemo4 {
    @MyTest
  private void test1(){
      System.out.println("--test1---");
  }
    private void test2(){
        System.out.println("--test2---");
    }
    @MyTest
    private void test3(){
        System.out.println("--test3---");
    }

    /**
     * 启动菜单，有注解的才调用
     * @param args
     */
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 t =new AnnotationDemo4();
       //获取类对象
        Class c=AnnotationDemo4.class;
        //提取全部方法
        Method[] methods = c.getDeclaredMethods();
        //遍历方法判断是否有注解有就跑
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(t);
            }
        }
    }
}
