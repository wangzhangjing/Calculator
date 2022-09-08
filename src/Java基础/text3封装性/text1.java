package Java基础.text3封装性;
//代码块
//1普通代码块，在方法中写的代码块
//2构造块 是在类中定义的代码块，在创建对象时被调用，优于构造方法执行
//3静态代码块 在类中用static申明的代码块被称为静态代码块
//在第一次使用中被调用（创建对象）只会执行一次，于构造代码块执行
//在开发项目中 通常会使用静态代码块来初始化只调用一次的数据。比如说：配置信息
//小结 重点会使用的是静态代码块，普通代码块，同步代码块，构造代码块
public class text1 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();

    }
}
class Student{
    static{
        System.out.println("静态代码块");
    }
    public Student() {


        System.out.println("构造方法");
    }{
        System.out.println("我是构造代码快");
    }

    public void study(){
        {int i = 10;
        System.out.println("我是普通代码快");
    }
    }

}