package text1;

import static text1.test3.*;


public class text {

    public static void process1(){
        int n=1000;
        int a=0;
        for (int i=0;i<n;i++){
           a=2+5;
           a=4*7;
           a=6*8;
        }
    }

    public static void process2(){
        int n=1000;
        int a=0;
        for (int i=0;i<n;i++){
           a=3|6;
           a=3&4;
           a=4^785;
        }
    }


    public static void main(String[] args) {
//        System.out.println(3<7?4:7);\
        int []wzj={2,3,4,5};
//        System.out.println();
        //递归寻找最大数
//        int max = getMax(wzj);
//        System.out.println(max);
        //递归排序
        getpx(wzj);
        //小和
//        int i = getxh(wzj);
//        System.out.println(i);
    }


}
