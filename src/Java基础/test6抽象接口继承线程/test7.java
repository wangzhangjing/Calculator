package Java基础.test6抽象接口继承线程;

public class test7 {
    public static void main(String[] args) {
        MyThread x1 =new MyThread();
        MyThread x2 =new MyThread();


        x1.setName("张飞");
        x2.setName("关羽");
        //设置主线程
        Thread.currentThread().setName("刘备");
        //设置守护线程
        x1.setDaemon(true);
        x2.setDaemon(true);

        x1.start();
        x2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
