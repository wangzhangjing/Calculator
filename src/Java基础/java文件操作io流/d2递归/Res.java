package Java基础.java文件操作io流.d2递归;

public class Res {
    public static void main(String[] args){
test2();
    }
    public static void test(){
        System.out.println("=======tets=======");
        test();
    }

    public static void test2(){
        System.out.println("=======tets=======");
        test3();
    }
    public static void test3(){
        System.out.println("=======tets=======");
        test2();
    }
}
