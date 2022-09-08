package Java基础.test8设计模式链表jdk8表达式;
/*适配器模式
* 将一个类的接口转换成客户希望的另一个接口
* 适配器模式使用由于接口不兼容而不能一起工作的那些类一起工作
* */
public class test9 {
    public static void main(String[] args) {
        PowerA powerA =new PowerAImpl();
        work(powerA);
        PowerB powerB=new PowerBImpl();
//        work(powerB);
        //通过适配器
        Adapter adapter=new Adapter(powerB);
        work(adapter);

    }
    public static void work(PowerA a){
        System.out.println("正在连接。。");
        a.insert();
        System.out.println("工作结束");
    }
}
interface Animal{
    public void sing();
    public void cry();
    public void run();
    public void swim();
}
//适配器类
abstract class AnimalFunction{
    public void sing() {}
    public void cry() {}
    public void run() {}
    public void swim() {}
}
class Dog extends AnimalFunction{

    public void run() {
        System.out.println("我是疯狗我疯狂的跑");
    }
}

//适配器
class Adapter implements PowerA{
    private PowerB powerB;
    public Adapter(PowerB powerB){
        this.powerB=powerB;
    }

    @Override
    public void insert() {
        powerB.connet();
    }
}

interface PowerB{
    public void connet();
}
class PowerBImpl implements PowerB{

    @Override
    public void connet() {
        System.out.println("电源B开始工作");
    }
}

interface PowerA{
    public void insert();
}
class PowerAImpl implements PowerA{

    @Override
    public void insert() {
        System.out.println("电源A开始工作");
    }
}