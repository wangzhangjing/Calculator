package Java基础.junit反射动态代理注解.注解;

/**
 * 认识元注解
 *
 */
//@MyTest //只能注解方法和成员变量
public class AnnotationDemo2 {
    @MyTest
    private String name;

    @MyTest
    public void test(){

    }

    public static void main(String []args){

    }
}
