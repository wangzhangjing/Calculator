package text5;

public class test4 {
    public static void main(String[] args) {
        Girl ww=new Girl("牛逼");
        ww.sleep();
        ww.eat();
        ww.run();
    }
}


interface IEat{
//    public abstract void eat();
    void eat();//接口中定义的方法没有声明修饰符的话，默认为public abstact
//    public static final int NUM =10;//接口中定义常量
    int NUM=10;//常量
    //在jdk1.8后的新特性，可以本所有实现类继承
    public default void print(){
        System.out.println("eat");
    }
}

interface IRun{
    void run();
}
//接口之间可以多继承（类只能单继承）
interface ISleep extends IEat,IRun{
    void sleep();

}
//具体的实现接口必须要实现接口的所有方法
class Girl implements ISleep,IEat{

    private String name;

    public Girl(String name){
        this.name=name;
    }
    public Girl(){}

    @Override
    public void eat() {
        System.out.println("我是"+name+"，我爱吃猪脚");
    }

    @Override
    public void run() {
        System.out.println("吃完就跑");
    }

    @Override
    public void sleep() {
        System.out.println("我爱睡觉");
    }
}