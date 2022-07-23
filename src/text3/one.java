package text3;

public class one {
    public static void main(String[] args) {
       Horse h=null;//声明一个类的变量（除了基本类型都是引用类型）
        //创建一个horse类型的对象，实例化对象
        h =new Horse();
        //有了对象可以调用对象的实现和方法
        h.name="红马";
        h.age=33;
        h.run();//调用方法，那么方法就能执行
        h.eat();

        //匿名对象:只能使用一次，用完后改对象就被释放
        new Horse().eat();
        h = null;//释放对象
        //h.eat()://当对象不存在时，调用该对象就会报错（空指针）
        Horse h1=null;
        Horse h2=null;
        h1 =new Horse();
//        h2 =new Horse();
        h1.name="草尼马";
        h1.age=123;
//        h2.name="尼马";
//        h2.age=73;
//        h1.run();
//        h2.run();
        h2=h1;
        h2.name="曹尼玛";
        System.out.println(h1.name);
//        h2.run();

        Horse h3=null;
        Horse h4=null;
        h3 =new Horse();
        h4 =new Horse();
        h3.name="白龙马";
        h3.age=49;
        h4=h3;
        h4.name="黑马";
//        h4.age=45;
        System.out.println(h3.name);
    }
}
class Horse{
    //类中定义属性（特征）
    String name;
    int age;
    public void run(){
        System.out.println("我是"+name+"已经"+age+"岁了但是我跑得快");
    }
    public void eat(){
        System.out.println("我cxiao");
    }
}