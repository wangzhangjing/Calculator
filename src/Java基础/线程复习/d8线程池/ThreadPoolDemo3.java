package Java基础.线程复习.d8线程池;
/**
 *目标。使用Executors的工具方法直接得到一个线程池对象。
 */

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
public class ThreadPoolDemo3 {
    public static void main(String[] args){
        //创建固定线程数据的线程池
        ExecutorService pool =Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());//已经没有多余的线程了
    }
}
