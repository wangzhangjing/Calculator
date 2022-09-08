package Java基础.text5;
/*
* 继承：从组件已经有的类中创建新的类的过程
* 继承一个父类，只能继承非私有的数据（方法和属性）
* protected修饰符 受保护的访问修饰符，用于修饰属性和方法，使用这个可以被子类继承
*创建子类对象时，父类的构造方法也会被调用
*因为子类要用到父类的数据那么就要通过父类的构造方法来初始化数据
*如果创建子类对象时使用默认的构造方法，那么父类的默认构造方法也会被调用
*如果创建子类对象时使用的是带参数的构造方法，那么父类默认构造方法也会被调用
* 当父类中没有无参构造方法时，子类必须显示的调用父类的带参构造方法，必须第一行
* 可以在子类中显示的使用super调用父类的构造方法
* */
public class text1 {
    public static void main(String[] args) {
       HomeDog homeDog =new HomeDog("dkds");
       homeDog.print();
       homeDog.eat();
    }
}
class Dog{
    protected String name;
    private String sex;
    public  Dog(String name,String sex){
        this.name=name;
        this.sex=sex;
        System.out.println("我是dog的构造方法");
    }
public void eat(){
    System.out.println("吃饭");
}
}
class HomeDog extends Dog{
    public  HomeDog(String name){
        super(name,"23");
        this.name=name;
        System.out.println("我是homedog的构造方法");
    }
    public  void print(){
        System.out.println(name+"我是一只家狗，修勾");
    }
}
class HaskyDog extends Dog{
    public HaskyDog(){
        super("hsas","SSM");
        System.out.println("我是haskydog的构造方法");
    }
    private void show(){
        System.out.println(name+"我是hasky，我能跳舞");
    }
}