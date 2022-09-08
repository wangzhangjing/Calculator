package Java基础.junit反射动态代理注解.class反射之泛型删除;

/**
 * 提供一个通用框架，支持保存所有对象的具体信息
 *
 */

public class ReflectDemo1 {
    public static void main(String[] args)throws Exception{
        Students s=new Students();
        s.setName("猪八戒");
        s.setClassName("西天跑路一班");
        s.setAge(1000);
        s.setHobby("吃，喝，睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t=new Teacher();
        t.setName("嘿嘿");
        t.setSex('男');
        t.setSalary(5440);
        MybatisUtil.save(t);
    }
}
