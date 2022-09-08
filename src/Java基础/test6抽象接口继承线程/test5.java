package Java基础.test6抽象接口继承线程;

public class test5 {
    public static void main(String[] args) {
        MyThread m1 =new MyThread();
        MyThread m2 =new MyThread();
        MyThread m3 =new MyThread();

        m1.setName("小汽车");
        m2.setName("火车");
        m3.setName("飞机");

//        System.out.println(m1.getPriority());
//        System.out.println(m2.getPriority());
//        System.out.println(m3.getPriority());
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
        m1.setPriority(5);
        m2.setPriority(10);
        m3.setPriority(1);


        m1.start();
        m2.start();
        m3.start();
    }
}
