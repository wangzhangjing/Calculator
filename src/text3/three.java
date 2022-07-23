package text3;

public class three {
    public static void main(String[] args) {
        //重载
//        Dog dog = new Dog();
        Dog dog = new Dog("小黑",2);
//        Dog dog1 = new Dog("小黑");
    }
}

class Dog{
    //默认构造方法
    public Dog(){
        System.out.println("构造方法执行");
    }
    public Dog(String name){
        this.name=name;
        System.out.println("1个参数构造方法执行");
    }
    public Dog(String name,int age){
        //调用其他构造方法时this（）必须在第一句。
        this(name);
        this.age=age;
//        this.name=name;

        System.out.println("带两个参数的构造方法执行");
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}