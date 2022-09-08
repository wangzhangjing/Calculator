package Java基础.test7泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("圣诞节");
        c.add("快乐");
        c.add("设计师");
//        c.add(100);

        //遍历
//        for (Object o:c
//             ) {
//            System.out.println(o);
//        }
//        Iterator it =c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
//            Object o =it.next();
            String o = it.next();

            System.out.println(o);
        }
    }
}
