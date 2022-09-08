package Java基础.test9集合框架和lambda表达式;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class test3集合输出迭代 {
    //断言接口
    private static void predicateTest(){
        List<String> list =Arrays.asList("tom","Moe","Larry","Curly","QF_vince");
        List<String> c = filter(list, s -> s.contains("o"));
        c.forEach(System.out::println);
    }
    private static List<String> filter(List<String> list, Predicate<String> p){
        List<String> results =new ArrayList<>();
        for (String s:list) {
            if (p.test(s)){//测试是否符合要求
              results.add(s);
            }
        }
        return results;
    }
    //供应商接口
    private static void supplierTest(){
        List<Integer> list =getNums(10,()->(int)(Math.random()*100));
        list.forEach(System.out::println);
    }
    private static List<Integer> getNums(int num,Supplier<Integer> sup){
      List<Integer> list =new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }

      return list;
    }
   //接受参数产生结果
    private static void functionTest(){
        String s = strToUpp("qf_vince", (str) -> str.toUpperCase());
        System.out.println(s);
    }
    public static String strToUpp(String str,Function<String,String> f){
        return f.apply(str);
    }
    /**
     * jdk1.8新迭代方法
     *
     */
    private static void foreach(){
        List<String> list =new ArrayList<>();
        list.add("mm");
        list.add("简单");
        list.add("2谔谔");
        list.add("阿");
//        list.forEach((String s)->{System.out.println(s);});
//        list.forEach((s)->{System.out.println(s);});
//        list.forEach(s->System.out.println(s));
        list.forEach(System.out::println);

    }
    //1.0开始
    private static void enumeration(){
        Vector<String> vs=new Vector();
        vs.add("tom");
        vs.add("jack");
        vs.add("job");
        vs.add("lily");
        Enumeration<String> es = vs.elements();
        while (es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
    }
    //1  foreach(1.5)后才有
    private static void foreach(Collection<Cat> c){
        for (Cat cat:c){
            System.out.println(cat);
        }

    }
    //2 iterator1.5之前统一的迭代方式
    private static void iterator2(Collection<Cat> c){
        Iterator<Cat> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main(String [] args){
        List<Cat> list =new ArrayList<>();
        list.add(new Cat("mm",3,1));
        list.add(new Cat("简单",2,3));
        list.add(new Cat("2谔谔",1,2));
        list.add(new Cat("阿",3,4));
//      foreach(list);
//      iterator2(list);
//      enumeration();
//      foreach();
//        functionTest();
//        supplierTest();
        predicateTest();
    }
}
