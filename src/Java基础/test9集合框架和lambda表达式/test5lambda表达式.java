package Java基础.test9集合框架和lambda表达式;

public class test5lambda表达式 {
    public static void main(String[] args){
       Animal a=new Animal() {
           @Override
           public void run() {
               System.out.println("乌龟跑不了");
           }
       };
       a.run();

//       Animal a1=()->{
//           System.out.println("乌龟跑得慢");
//       };
    }
}
abstract class Animal{
    public abstract void run();
}