package Java基础.test8设计模式链表jdk8表达式;
/*
* 内部类
* 成员内部类；直接在类中定义的类
* 方法内部类：方法内部定义一个类
*   (1)方法内部类只能定义在该内部类的方法内实例化，不可以在外面实例化
*   （2）方法内部类对象不能使用该内部类所在方法的非final局部变量
* 静态内部类在内中定义一个静态修饰的内部类
* 静态的含意是该内部类可以向其他静态成员一样，没有外部类对象时，也内部访问它
* 静态嵌套类仅能访问外部类的静态成员和方法
* 匿名内部类就是没有名字的内部类
*  匿名内部类3种方式
*   1继承式的匿名内部类
*   2接口式的匿名内部类
*   3参数式的匿名内部类
*
* */
public class test {
    public static void main(String[] args) {
        Outer outer=new Outer();
        //在外部创建成员内部类实例,因为成员内部类需要依赖外部对象，通常情况下不建议这样创建内部类对象
//        Outer.Inner inner=outer.new Inner();
//        inner.print();
        outer.innerPrint();
        outer.show();
        Outer.Inner3 inner3= new Outer.Inner3();
        inner3.print();
        outer.print1();
        outer.print2();
        outer.print3(new Eat() {
            @Override
            public void eat() {
                System.out.println("参数式匿名内部类");
            }
        });
    }
}

class Outer{
    //---------成员内部类-----------
    private String name ="out";
    public void innerPrint(){
        Inner inner=new Inner();
        inner.print();
    }
    class Inner{
        public void print(){
            System.out.println("成员内部类inner"+name);
        }
    }
    //---------方法内部类-----------
    //
    public void show(){
//        int x =10;
//        从内部类引用的本地变量必须是最终变量或实际上的最终变量
//        show方法的局部变量必须是最终变量或者实际上的最终变量才能用
//        x++;
        class Inner2{
            public void print(){
//                System.out.println("方法内部类inner2"+x);
                System.out.println("方法内部类inner2"+name);
            }
        }
        Inner2 inner2=new Inner2();
        inner2.print();
    }
    //---------静态内部类类-----------
    static class Inner3{
        public void print(){
            System.out.println("静态内部类inner3");
        }
    }
    //---------匿名内部类类-----------
    //继承
    public void print1(){
      Cat cat =new Cat() {
          @Override
          public void eat() {
              System.out.println("cat:继承式");
          }
      } ;
      cat.eat();
    }
    //接口式匿名内部类
    public void print2(){
        Eat eat=new Eat() {
            @Override
            public void eat() {
                System.out.println("cat:接口式");
            }
        };
        eat.eat();
    }
    //参数式匿名内部类
    public void print3(Eat eat){
        eat.eat();
    }
}

interface Eat{
    public void eat();
}


abstract class Cat{
    public abstract void eat();
}