package Java基础.线程复习.d8线程池;

import java.util.concurrent.*;

/**
 * 目标自定义线程池对象，并测试其特性
 * int corePoolSize,//核心线程数
 *                               int maximumPoolSize,最大线程数
 *                               long keepAliveTime,其他线程存活时间
 *                               TimeUnit unit,时分秒
 *                               BlockingQueue<Runnable> workQueue,任务队列
 *                               ThreadFactory threadFactory,线程工厂
 *                               RejectedExecutionHandler handler任务完成后策略模式
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args){
        ExecutorService pool=new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //2给任务线程池处理
        Runnable runnable=new MyRunnable();
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);

        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        //创建临时线程，已经超过核心线程数加队列数和了
        pool.execute(runnable);
        pool.execute(runnable);

//        pool.execute(runnable);
       //不创建新的任务，拒绝

        //关闭线程池（一般不会使用）
//        pool.shutdownNow();//立即关闭，即使任务没用完成，丢失任务
        pool.shutdown();//等待全部任务执行完成，才关闭
    }
}
