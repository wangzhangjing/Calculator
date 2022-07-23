package text5;

public class text7简单工厂模式 {
    public static void main(String[] args) {
        //使用者和被使用者之间耦合 产生依赖，当被使用者改变时会影响使用者
        Product phone =new Phone();
        phone.work();

    }
}
interface Product{
    public void work();
}
class Phone implements Product{
    @Override
    public void work() {
        System.out.println("手机开始工作");
    }
}
class Computer implements Product{

    @Override
    public void work() {
        System.out.println("电脑开始工作");
    }
}