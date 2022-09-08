package Java基础.线程复习.d2;

public class ThreadDemo1 {
    public static void main(String [] args){
        //主线程默认为main
        //其他的为Thread-0——》类似
        Thread t =new MyThread("线程一");
        t.start();
        Thread t1 =new MyThread("线程二");
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}
