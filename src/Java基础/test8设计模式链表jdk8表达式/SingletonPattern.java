package Java基础.test8设计模式链表jdk8表达式;

public class SingletonPattern {
    public static void main(String[] args) {

    }
}
////饿汉式
//class Singleton{
//    private static Singleton singleton=new Singleton();
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}
//懒汉式加锁
//class Singleton{
//    private static Singleton singleton;
//    private Singleton(){}
//
//    public synchronized static Singleton getInstance(){
//        if (singleton==null){
//            new Singleton();
//        }
//        return singleton;
//    }
//}
//双重检查锁
class Singleton{
    private volatile static Singleton singleton;
    private Singleton(){}

    public  static Singleton getInstance(){
        if (singleton==null)
            synchronized (Singleton.class){
            if (singleton==null)
                new Singleton();
            }
        return singleton;
    }
}