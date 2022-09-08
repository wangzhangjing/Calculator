package Java基础.junit反射动态代理注解.class反射;

public class Test {
    public static void main(String[] args) throws Exception {
        //1.class类中的一个静态方法forName
        Class c=Class.forName("Java基础.junit反射动态代理注解.class反射.Student");
        System.out.println(c);
        //2类民。class
        Class c1=Student.class;
        System.out.println(c1);
        //3对象。getClass 获取对象对应的class对象
        Student s=new Student();
        Class c2=s.getClass();
        System.out.println(c2);

    }
}
