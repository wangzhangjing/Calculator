package text5;
/*
 final关键字
 使用final声明一个属性，就是常量，常量的命名规则建议使用全大写
 常量必须在定义是或者在构造器中初始化
2使用final声明的方法不能被子类重写只能被继承
final关键字声明一个类，该类变成最终类，没有字类的类，final修饰的类也无法继承
* */
public class text3final {

    public static void main(String[] args) {

        System.out.println(cll.PERSON_NUM);

    }

//在实际开发中常量通常用于定义项目中的公共的不变的数据
    public class cll{
        final static public int PERSON_NUM =10;
    }

    class FinaClanss{
        public final int DAY_NUMBER;

        public FinaClanss() {
            DAY_NUMBER = 0;
        }
        public final void print(){
            System.out.println("我是final方法");
        }
        public void selLength(final int size){

        }
    }

    class SubClass extends FinaClanss{

    }

}

//常量类（工具类）


