package Java基础.线程复习.d3安全锁;

public class ThreadDemo {
    public static void main(String []args){
        Account account =new Account("IS-121",100000);

        //2创建两个线程对象，代表小明和小红
        new DrawThread(account,"小明").start();
        new DrawThread(account,"小红").start();
        Account account1 =new Account("IS-122",100000);

        //2创建两个线程对象，代表小明和小红
        new DrawThread(account1,"小黑").start();
        new DrawThread(account1,"小白").start();
    }
}
