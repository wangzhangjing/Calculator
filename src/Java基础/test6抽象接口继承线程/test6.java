package Java基础.test6抽象接口继承线程;

public class test6 {
    public static void main(String[] args) {
        MyThread x1 =new MyThread();
        MyThread x2 =new MyThread();
        MyThread x3 =new MyThread();

        x1.setName("康熙");
        x2.setName("四阿哥");
        x3.setName("八阿哥");

        x1.start();
        try {
            x1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        x2.start();
        x3.start();
    }
}
