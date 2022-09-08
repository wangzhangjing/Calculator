package Java基础.线程复习.d1_create;

/**
 * 目标多线程创建一，继承Thread 类实现
 *
 *
 */
public class ThreadDemo1 {
    public static void main(String[] args){
        Thread my=new MyThread();
        my.start();//必须是start告诉我们操作系统开了新线程cpu启动run
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出"+i);
        }
    }
}
//定义一个线程类继承Thread
class MyThread extends Thread{
    /**
     * 重写run方法定义后面线程干嘛
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出"+i);
        }
    }
}