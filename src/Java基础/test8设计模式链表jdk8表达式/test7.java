package Java基础.test8设计模式链表jdk8表达式;



/*简单工厂模式*/
public class test7 {
    public static void main(String[] args) {
        //使用者和被使用者之间耦合，产生了依赖，当被使用者改变时会影响使用者
      Prod p =new Phone();
      p.work();
      Prod c=()->{
          System.out.println("wdjhe");
      };
      c.work();
      Prod cc=new Computer();
      cc.work();
      //使用工厂模式降低两者耦合
      Prod phone =ProductFactory.getProd("phone");
      phone.work();
    }
}
//简单工厂类
class ProductFactory{
    public static Prod getProd(String name){
        if ("phone".equals(name)){
            return new Phone();
        }else if ("computer".equals(name)){
            return new Computer();
        }else{
            return null;
        }
    }
}

interface Prod{
    public void work();
}

class Phone implements Prod{

    @Override
    public void work() {
        System.out.println("手机在工作");
    }
}
class Computer implements Prod{

    @Override
    public void work() {
        System.out.println("电脑在工作");
    }
}