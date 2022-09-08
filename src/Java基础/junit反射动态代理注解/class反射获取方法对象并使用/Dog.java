package Java基础.junit反射动态代理注解.class反射获取方法对象并使用;

public class Dog {
    private String name;
    public Dog(){

    }
    public Dog(String name){

    }
    public void run(){
        System.out.println("狗跑的贼快。。");
    }
    private void eat(){
        System.out.println("狗吃骨头");
    }
    private String eat(String name){
        System.out.println("狗吃"+name);
        return "吃的很开心";
    }
    public static void inAddr(){
        System.out.println("在构造中有一群单身狗");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
