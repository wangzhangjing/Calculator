package Java基础.test9集合框架和lambda表达式;

public class test6lambda2 {
    public static void main(String[] args){
        //lambda只能简化接口中只有一个抽象方法的匿名内部类
        Swimming s1 =new Swimming() {
            @Override
            public void swin() {
                System.out.println("老师游泳贼溜");
            }
        };
        go(s1);
        Swimming s2 = ()->System.out.println("老师游泳贼溜hh");
        go(s2);

        go(()->System.out.println("老师游泳贼溜3"));
    }
    public static void go(Swimming s){
        System.out.println("开始....");
        s.swin();
        System.out.println("结束");
    }
}

@FunctionalInterface  //一旦加上这个注解必须是函数式接口里面只能有一个抽象方法
interface Swimming{
    void swin();
}