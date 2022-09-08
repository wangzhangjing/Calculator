package Java基础.test7泛型;

public class test6 {
//    public void show(String s){
//        System.out.println(s);
//    }
//    public void show(Integer i){
//        System.out.println(i);
//
//    }public void show(Boolean b){
//        System.out.println(b);
//    }
    //泛型类改进
//    public void show(T t){
//        System.out.println(t);
//    }
    //泛型方法改进

    public <T> void show(T t){
        System.out.println(t);

}
}


