package Java基础.线程复习.d1_create;

/**
 * 目标：学会线程创建方式2，理解优缺点
 */
public class ThreadDemo2 {
    public static void main(String[] args){
        //创建对象
        MyRunnable  tar =new MyRunnable();
        //给线程对象
        new Thread(tar).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行："+i);
        }
    }
}
//定义一个线程任务类实现runnable接口
class MyRunnable implements Runnable{
    //重写run、方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行："+i);
        }
    }


}