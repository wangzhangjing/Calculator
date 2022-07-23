package text3;
/*
* this关键字
* 调用类中属性
* 调用类中方法或者构造方法
* 表示当前对象:在方法调用过程中，那个东西调用了方法，在方法里的this就表示谁
* 类民。this
* */
public class four {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小花");
        cat.setAge(4);
//        System.out.println(cat);
        cat.eat();
    }
}
class Cat{

    public Cat(){

    }

    public Cat(String name){
        this.name=name;
        System.out.println("1个参数构造方法执行");
    }
    public Cat(String name,int age) {
        //调用其他构造方法时this（）必须在第一句。
        this(name);
        this.age = age;
    }
    private String name;//成员变量，类中定义的    局部变量方法中定义的
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {//name=小花
        this.name = name;//this代表当前对象小花
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        //在方法中用this调用类中其他方法。this可以省略
        System.out.println("我是"+Cat.this.getName()+"我爱吃鱼");
    }

}