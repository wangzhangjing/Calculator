package Java基础.test8设计模式链表jdk8表达式;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
//        IEat iEat =new IEatImpl();
//        iEat.eat();
//
//        IEat iEat1 =new IEat() {
//            @Override
//            public void eat() {
//                System.out.println("eat bnana");
//
//            }
//        };
//        iEat1.eat();

//        //--------------------1----------------，lambda表达式好处让代码更加简介  2不会单独生成class文件
//        IEat iEat2 =()->{
//            System.out.println("eat orange");
//        };
//        iEat2.eat();
//    }
        //-------------2-------------or
//        IEat iEat2 =()->
//            System.out.println("eat orange");
//
//        iEat2.eat();

//       ------------3------------
        //带参数时使用
//        IEat iEat3 =(thing,name)-> System.out.println(name+"eat .."+thing);
//        iEat3.eat("apple","大兵");
        //代码快中有多行代码大括号不能省略
//        IEat iEat3 =(thing,name)-> {
//            System.out.print(name);
//            System.out.println("eat .."+thing);
//
//        };
//        iEat3.eat("apple","大兵");
//        IEat iEat4 =(thing,name)->{
//            System.out.println(name+"apple"+thing);
//            return 10;
//        };
        //返回值
//        IEat iEat4 =(thing,name)->10;
//        IEat iEat4 =(thing,name)->thing==null?0:1;
        //or
        IEat iEat4 =(final String thing,final String name)->thing==null?0:1;
        iEat4.eat("dad","wdwq");
        test3[] student ={new test3("张三",18),new test3("李四",19),new test3("王五",17)};
//        Arrays.sort(student, new Comparator<test3>() {
//            @Override
//            public int compare(test3 o1, test3 o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        Comparator<test3> c=(o1,o2)->o1.getAge()-o2.getAge();
        Arrays.sort(student,(o1,o2)->o1.getAge()-o2.getAge());
        System.out.println(Arrays.toString(student));
        iEat4.print();

    }
}

//只有一个抽象方法的接口
interface IEat{
    //抽象方法
    public int eat(final String thing,final String name);
    //默认构造方法
    public default void print(){
        System.out.println("print test");
    }
    public static void print1(){
        System.out.println("static test");
    }
}
//interface IEat{
//    public int eat(String thing,String name);
//
//}
//interface IEat{
//    public void eat(String thing,String name);
//}
//interface IEat{
//    public void eat();
//}
//class IEatImpl implements IEat{
//    public void eat() {
//        System.out.println("好吃 eat apple");
//    }
//    @Override
//    public void eat(String thing) {
//        System.out.println("eat--"+thing);
//    }
//}