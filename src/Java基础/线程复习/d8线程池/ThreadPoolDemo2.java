package Java基础.线程复习.d8线程池;

import java.util.concurrent.*;

/**
 * 目标自定义线程池对象，并测试其特性
 * int corePoolSize,//核心线程数
 *                               int maximumPoolSize,最大线程数
 *                               long keepAliveTime,临时线程存活时间
 *                               TimeUnit unit,时分秒
 *                               BlockingQueue<Runnable> workQueue,任务队列
 *                               ThreadFactory threadFactory,线程工厂
 *                               RejectedExecutionHandler handler任务完成后策略模式
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args){
        try {
            ExecutorService pool=new ThreadPoolExecutor(3,
                    5,
                    5,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(5),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            //2给任务线程池处理
            Future<String> f1 = pool.submit(new MyCallable(100));
            Future<String> f2 = pool.submit(new MyCallable(200));
            Future<String> f3 = pool.submit(new MyCallable(300));
            Future<String> f4 = pool.submit(new MyCallable(400));
            Future<String> f5 = pool.submit(new MyCallable(500));

//        String rs =f1.get();
//        System.out.println(rs);
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
