package Java基础.test7泛型;

public class test4 {
    public static void main(String[] args) {
        test2 t2 = new test2();
        t2.setName("林青霞");
        System.out.println(t2.getName());
        test3 t3 =new test3();
        t3.setAge(60);
        System.out.println(t3.getAge());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        test5<String> t5 =new test5();
        t5.setT("林青霞");
        test5<Integer> t55 =new test5();
        t55.setT(69);
        System.out.println(t5.getT());
        System.out.println(t55.getT());

    }

}
