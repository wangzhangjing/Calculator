package text5;

public class test5 {
    public static void main(String[] args) {
        HomeChickn hc =new HomeChickn("小白");
        hc.eat();
        YeChickn yc =new YeChickn("大鸡");

        yc.eat();
        Chickn jjj=new JJChickn("JJ鸡");
        eat(jjj);
    }
//抽象（粒度）面向抽象编程
    private static void eat(Chickn c) {
        System.out.println("急急急");
        c.eat();
//        c.song();
        //大的转化小的，强制转换向下转型
        //当我们需要把父类的实例强制转换为子类的引用时，为了避免转换异常
        //那么我们需要在转换之前作类型检查
        if (c instanceof JJChickn) {//成立的条件是，对象的本身集对象的父类都可以通过检查
            JJChickn jjc = (JJChickn) c;
            jjc.song();
        }
    }
}
 abstract class Chickn{
    private String name;
    public Chickn(){
    }
    public abstract void eat();

     public Chickn(String name) {
           this.name= name;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

 }


 class HomeChickn extends Chickn{
        public HomeChickn(String name){
            super(name);
        }
        public void eat(){
            System.out.println(this.getName()+"我爱吃米");
        }
 }
 class YeChickn extends Chickn{
     public YeChickn(String name){
         super(name);
     }
     public void eat(){
         System.out.println(this.getName()+"吃虫子");
     }
 }
class JJChickn extends Chickn{
    public JJChickn(String name){
        super(name);
}
    public void eat(){
        System.out.println(this.getName()+"我不吃东西");
    }
    public void song(){
        System.out.println("jjjjjjjj");
    }
}