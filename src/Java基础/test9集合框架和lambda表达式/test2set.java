package Java基础.test9集合框架和lambda表达式;

import java.util.*;

/**
 * set接口
 * 无序
 * 不允许重复
 * HashSet ,treeSet,linkedHashSet
 *
 */
public class test2set {

    private static void treeMap(){
        Map<String,String> map=new TreeMap<>();//安装字母顺序排序
        map.put("one","Lily");
        map.put("two","tom");
        map.put("three","Bin");
        map.forEach((key,value)->System.out.println(key+"->"+value));
        Map<Dog,String> dogs =new TreeMap<>();
        dogs.put(new Dog(1,"二哈",3),"dog1");
        dogs.put(new Dog(2,"玩玩",2),"dog2");
        dogs.put(new Dog(3,"吃饭饭",4),"dog3");
        dogs.forEach((key,value)->System.out.println(key+"->"+value));
    }
    private static void linkedHashMap(){
        Map<String,String> test=new LinkedHashMap<>();
        test.put("one","Lily");
        test.put("two","tom");
        test.put("three","Bin");
        test.forEach((key,value)->System.out.println(key+"->"+value));
    }
    /**
     * HashSet
     * 实现原理基于hashMap实现
     * 不允许重复，一个有一个null
     * 不保证顺序不变
     * 添加元素时把元素作为hashmap的key存储，value使用固定的object对象补充
     *排除重复元素是通过equals来检查对象是否相同
     * 判断两个对象是否相同先判断两个对象的hashcode是否相同如果两个对象的hashcode相同不一定是同一个对象，如果不同那一定不是同一个对象，如果相同，则两个对象equals判断
     * equale相同那么是同一个对象，不同则不是同一个对象
     * 自定义对象要认为属性值都相同时为同一个对象，有这种需求时我们需要重写对象所在类的hashcode和equals方法
     *
     * hashmap的存储结构数组加链表 1.8引入红黑树防止黑客
     * 如何把对象存储到哈希表中，先计算对象的hashcode值在对数组的长度进行求余数决定对象存储在数组的位置
     * 解决hashset的重复值看上面
     */

    private static void hashSet(){
        Set<String> set =new HashSet<>();
        set.add("帆帆");
        set.add("贝贝");
        set.add("零零");
        set.add("谷歌");
        set.add("草草");
        set.add("零零");
        System.err.println(set.size());
        String[] strings = set.toArray(new String[]{});
        for (String str:strings
             ) {
            System.out.println(str);
        }
        Cat cat1 =new Cat("喵喵",5,1);
        Cat cat2 =new Cat("哈哈",2,2);
        Cat cat3 =new Cat("Tom",3,3);
        Cat cat4 =new Cat("加菲猫",1,4);
        Cat cat5 =new Cat("喵喵",5,1);
        Set<Cat> cats=new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
//        cats.add(cat1);
        cats.add(cat5);
        System.err.println(cats.size());
    }


    public static void main(String[] args){
//        hashSet();
//        linkedHashMap();
        treeMap();
    }
}
