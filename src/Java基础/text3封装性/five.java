package Java基础.text3封装性;

public class five {
    public static void main(String[] args) {
        int x= 10;
        method(x);
        System.out.println("x="+x);
    }
    public static void method(int mx){
       mx=20;
    }
}
