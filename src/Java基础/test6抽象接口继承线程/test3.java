package Java基础.test6抽象接口继承线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class test3 {
    public static void main(String[] args) {
        AtomicInteger c =new AtomicInteger(1);
        ArrayBlockingQueue<Runnable> queue =new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPool =new ThreadPoolExecutor(
                2,
                3,
                0,
                TimeUnit.MICROSECONDS,
                queue,r -> new Thread("myThread"+c.getAndIncrement()),
                new ThreadPoolExecutor.AbortPolicy());

    }
    private static void showState(ArrayBlockingQueue<Runnable> queue,ThreadPoolExecutor threadPool){

    }
    static class MyTask implements Runnable{
        @Override
        public void run() {

        }
    }
}
