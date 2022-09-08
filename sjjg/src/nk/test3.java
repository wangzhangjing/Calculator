package nk;

public class test3 {
    public static void main(String[] args) {
        int a=Integer.parseInt("1024");
        int b=Integer.valueOf("1024").intValue();
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);

    }
}
