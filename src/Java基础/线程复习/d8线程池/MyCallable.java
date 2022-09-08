package Java基础.线程复习.d8线程池;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //重写call方法（线程的任务方法）
    @Override
    public String call() throws Exception {
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"线程执行1-"+n+"结果是："+sum;
    }
}
