package Java基础.text3封装性;

public class senen {
    public static void main(String[] args) {
        String name = "大牛";
        method(name);
        System.out.println("name="+name);
    }
    public static void method(String sname){
        sname="大王";
    }
}
