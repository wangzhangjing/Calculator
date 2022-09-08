package Java基础.线程复习.d2;

public class MyThread extends Thread{
    public MyThread(String name) {
        //当前线程对象的名字送给父类的有参构造函数初始化名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程输出"+i+Thread.currentThread());
        }
    }
}
