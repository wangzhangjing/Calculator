package text3;
//封装性
//如果属性没有封装，那么在本类对象创建后可以直接访问属性
//private关键字：访问权限修饰符，public表示公有的，private表示私有的·，私有的属性或者方法只能在本类中访问
//公有的属性和方法，可以被类外部的其他类访问。想要访问私有的属性，我们需要提供公·有的方法来间接访问
public class two {
    public static void main(String[] args) {
        person p1 = new person();
       // p1.name="dwed";
       // p1.age=32;
        p1.setName("曹尼玛");
        p1.setAge(32);
        System.out.println("名字是"+p1.getName()+"今年"+p1.getAge()+"岁了");
        p1.run(4);
        p1=null;
    }
}
class person{
    private String name;//成员变量，类中定义的    局部变量方法中定义的
    private int age;
    //对外提供为name属性设值的方法
    public void setName(String name) {
        this.name = name;
    }
    //对外提供一个获取name属性的方法
    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void run(int let){
//        int m =len;
        System.out.println("跑了"+let+"米");
        System.out.println(age);
    }
}