package Java基础.线程复习.d7线程通信;

public class ThreadDemo555 {
    public static void main(String[] args){
        //了解线程通信流程
        //使用3个爸爸存钱(生产者)2个孩子取钱来模拟线程通信（消费者）（一存1w一取1w）
        //创建账号对象代表5个人共同操作账号
        Account account=new Account("IC-112",0);
        //创建两个取钱线程代表孩子
        //创建三个存钱线程代表他们的冤种爸爸们
        new DrawThread(account,"小明").start();
        new DrawThread(account,"小红").start();

        new DepositThread(account,"亲爹").start();
        new DepositThread(account,"干爹").start();
        new DepositThread(account,"岳父").start();
    }
}
