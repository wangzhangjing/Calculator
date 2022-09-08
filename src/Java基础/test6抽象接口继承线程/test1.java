package Java基础.test6抽象接口继承线程;
/*
* 抽象类。用abstract关键字说明的类称为抽象类
* 很多具有相同特征和行为的对象可以抽象为一个类
* 很多具有相同特征和行为的类可以抽象为一个抽象类
* */
public class test1 {
    public static void main(String[] args) {
       Man m =new Man();
       m.eat();
       m.move();
       Woman wm =new Woman();
       wm.eat();
       wm.move();
    }
}

abstract class Animal{
    public abstract void move(); //抽象方法只有声明没有实现
}

abstract class Person extends Animal{
    public abstract void eat();
}
//继承抽象类的具体类必须实现所以抽象方法
class Man extends Person{

    @Override
    public void move() {
        System.out.println("我是男人我爱跑步");
    }

    @Override
    public void eat() {
        System.out.println("我是男人我爱吃肉");
    }
}
class Woman extends Person{


    @Override
    public void move() {
        System.out.println("我是女人我爱逛街");
    }

    @Override
    public void eat() {
        System.out.println("我是女人我爱吃香蕉");
    }
}