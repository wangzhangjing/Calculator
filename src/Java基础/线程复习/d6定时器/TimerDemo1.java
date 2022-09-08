package Java基础.线程复习.d6定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时器的使用和了解
 *
 */
public class TimerDemo1 {
    public static void main(String[]args){
        //Timer定时器
        Timer timer=new Timer();//定时器本身就是单线程
        //2.调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行a一次"+new Date());
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        },0,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行b一次"+new Date());
                System.out.println(10/0);
            }
        },0,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行c一次"+new Date());
            }
        },0,3000);
    }
}
