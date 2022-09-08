package Java基础.test9集合框架和lambda表达式;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream:接口：不是存储数据结构，数据源可以是一个集合为了函数式编程查找，
 * 惰性执行，真正需要时才执行，数据只能被消费一次
 *
 * 两种类型的操作方法
 * 1中间操作方法（生成一个Stream）
 * 2结束操作（计算操作）
 *
 */
public class test4Stream {

    public static void main(String[] args){
        //foreach方法
        Stream<String> stream = Stream.of("good", "good", "study", "day", "day", "up");
//        stream.forEach(System.out::println);
//         stream.forEach(s -> System.out.println(s));
        //filter过滤
//        Stream<String> stream1 = stream.filter(s -> s.length() > 3);//中间操作，惰式执行
//        stream1.forEach(System.out::println);
        //distinct去重
//        Stream<String> stream1 = stream.distinct();
//        stream1.forEach(s-> System.out.println(s));
        //map映射
//        Stream<String> stream1 = stream.map(s -> s.toUpperCase());
//        stream1.forEach(s-> System.out.println(s));
        //flatMap平滩
//        Stream<List<Integer>> ss = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
//        ss.flatMap(list->list.stream()).forEach(System.out::println);
        //reduce
//        Optional<String> opt = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
//        System.out.println(opt.get());
        //collect转换流
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(System.out::println);
        //:: 方法引用
        //引用静态方法 Integer::valueOf
        //引用对象的方法 list::add
        //引用构造方法 ArrayList::new
    }


}
