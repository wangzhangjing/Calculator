package Java基础.线程复习.d6定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Timer定时器的使用和了解
 *
 */
public class TimerDemo2 {
    public static void main(String[]args){
       //1，创建ScheduledExecutorService线程池做定时器
        ScheduledExecutorService pool= Executors.newScheduledThreadPool(3);

        //2开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出aaa====>"+new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },0,2,TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出bbb=====>"+new Date());
                System.out.println(10/0);
            }
        },0,2,TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出ccc=====>"+new Date());
            }
        },0,2,TimeUnit.SECONDS);
    }
}
