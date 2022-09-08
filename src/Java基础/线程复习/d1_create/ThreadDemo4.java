package Java基础.线程复习.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 学会线程的创建方式3，实现callable接口，集合FutureTask完成
 */
public class ThreadDemo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建任务对象
        Callable<String> call =new MyCallable(100);
        //把Callable交给FutureTast对象
        FutureTask<String> aa=new FutureTask<>(call);
        new Thread(aa).start();
        System.out.println(aa.get());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行："+i);
        }
    }
}
//1,定义一个任务类实现Callable，应该申明线程任务执行完毕后结果的数据类型
class MyCallable implements Callable<String>{
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
        return "子线程执行结果是："+sum;
    }
}
