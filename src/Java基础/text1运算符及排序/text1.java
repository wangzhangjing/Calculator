package Java基础.text1运算符及排序;

import java.util.ArrayList;
import java.util.Collections;

public class text1 {
    public static void main(String[] args) {
 int[] a = {20,13,3,2,4,5,6};
 System.out.println(a.length);
 for (int i =1;i<a.length;i++){
     int  b = a[i];
     System.out.println(b);
 }
float aa=35.0f;
        int bb=5;
        System.out.println(aa*bb);

    String aaa= "佘山、松江大学城";
    if(aaa.contains("、")){
        ArrayList<Object> list = new ArrayList<>();
        String[] split = aaa.split("、");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
    }
}
