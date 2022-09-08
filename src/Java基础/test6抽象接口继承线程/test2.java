package Java基础.test6抽象接口继承线程;
//sleep 线程的休眠
//在当时线程执行中暂停多少毫米，释放cpu的时间片
public class test2 {
    public static void main(String[] args) {
        MyThreda mt =new MyThreda();

        MyRunnable mr =new MyRunnable();
        Thread t2 =new Thread(mr);

        mt.start();//启动线程
        t2.start();
    }
}
/*
* 实现线程的第一种方式继承Thread类
* */
class MyThreda extends Thread{
    public void run(){
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
* 实现线程的第二种方式： 实现Runnable接口
* */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}