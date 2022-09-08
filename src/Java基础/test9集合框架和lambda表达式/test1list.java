package Java基础.test9集合框架和lambda表达式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Collection接口：用于存储单个对象的集合
 * List接口：有序的重复的
 * 具体的实现类有ArrayList数字，Vector，LinkedList
 * Set接口：无序的不能重复有且只有一个null
 * 在实际开发中我们如何选择list具体实现呢
 * 1安全性
 * 是否频繁插入删除操作
 * 是否存储遍历
 */
public class test1list {
    /**
     * linkedList
     * 实现原理，采用双向列表结构实现
     * 适合，删除操作，插入性能高
     *
     */
    private static void linkedLIst(){
        LinkedList<String> list =new LinkedList<>();
        list.add("仓老师");
        list.add("李老师");
        list.add("张老师");
        list.add("毕老师");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    /**
     * Vector
     * 实现原里采用动态数组实现默认构造方法创建一个大小为10的对象数组
     * 扩充的算分当增量为零时扩充为原来大小的一倍，当增量大于0时扩充原来大小加增量
     * 不适合删除或插入
     * 为了防止数组动态扩充次数过多，建议创建Vector时给定初始容量
     * 线程安全的适合在多线程访问时使用，但在单线程效率较低
     */
    private static void vector(){
        Vector<String> v=new Vector<>();
        v.add("仓老师");
        v.add("李老师");
        v.add("张老师");
        v.add("毕老师");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }


    private static void arrayList(){
        //使用集合处理对象的不同元素类型的元素（对象）那么在处理时比较麻烦在实际开发时不建议
        //这样使用我们一个一个集合存储相同类型的元素对象
        /**
         * ArrayList实现原理，采用动态对象数组实现，默认构造方法创建一个空数组
         * 第一次添加元素扩充容量为10，之后的扩充算法：原来大小加原来大小一半
         * 不适合删除或插入操作
         * 为了防止数组动态扩充次数过多，建议创建ArrayList时给定初始容量
         * 线程不安全适合单线程访问使用
         * jdk1.2开始
         */

        List<String> list =new ArrayList();
        list.add("仓老师");
        list.add("李老师");
        list.add("张老师");
        list.add("毕老师");
//        list.add(10);
        int size =list.size();
        for (int i = 0; i <size ; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list.contains("仓老师"));//查看是否有该对象
        list.remove("毕老师");
        list.set(2,"石安可");
        System.out.println(list.size());
        String[] strings = list.toArray(new String[]{});
        for (String s:strings
             ) {
            System.out.println(s);
        }
    }

    public static void main(String[] args){
//      arrayList();
//      vector();
        linkedLIst();
    }
}
