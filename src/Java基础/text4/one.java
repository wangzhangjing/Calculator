package Java基础.text4;
/**单例设计模式
 * 1构造方法私有化
 * 2声明一个本类对象
 * 3给外部提供一个静态方法来获取对象实例
 *
 * 1懒汉式：在第一次调用getinstance方法时对象被创建，到程序结束后释放
 * 2饿汉式:在类杯加载后对象被创建，到程序结束后释放
 *
 * 在项目中单例的好处
 * 1在设计一些工具类的时候（通常工具类只有功能方法，没有属性）
 * 2工具类可能会被频繁调用
 * 3目的是为了节省重复创建对象所带来的内存消耗，从而提高效率
 * 使用构造方法私有化+静态方法来实现工具类和上面的如何比较好坏
 * 单例更省内存
 * */



public class one {
    public static void main(String[] args) {
// 不能这样      Singleton1 s =new Singleton1();

//        Singleton1 s =Singleton1.getInstance();
//        s.print();
//        Singleton1 s1 =Singleton1.getInstance();
//        s.print();
//        System.out.println(s==s1);

        Singleton2 s2 =Singleton2.getInstance();
        s2.print();
        Singleton2 s3 =Singleton2.getInstance();
        s3.print();
        System.out.println(s2==s3);
    }
}
//使用构造方法私有化+静态方法来实现工具类，比如Math
class Tools{
    private Tools(){
    }
    public static void print1(){}
    public static void print2(){}
}

//饿汉式：生命周期长，占用内存，提高效率
class Singleton1{
    private Singleton1(){

    }
    private static Singleton1 s = new Singleton1();
    public static Singleton1 getInstance(){
        return s;
    }
    public void print(){
        System.out.println("测试方法");
    }
}
//懒汉式：占用内存的时间短，效率低、、（懒加载，延迟加载）
//在多线程访问时有安全问题
class Singleton2{
    private Singleton2(){ }
    private static Singleton2 s;
    public static Singleton2 getInstance(){
        if (s==null){
            s = new Singleton2();
        }
        return s;
    }
    public void print(){
        System.out.println("测试方法2");
    }
}