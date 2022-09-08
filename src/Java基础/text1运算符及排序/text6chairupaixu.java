package Java基础.text1运算符及排序;

import java.util.Arrays;

public class text6chairupaixu {
    public static void main(String[] args) {
        int[]sss={77,53,32,23,82,14,25,66};

        for (int i=1;i<sss.length;i++){
           int q = sss[i];
           int j =0;
            for (j=i-1;j>=0;j--){
                if (sss[j]>q){
                    sss[j+1]=sss[j];
                }else {
                    break;
                }
            }
            if (sss[j+1]!=q){
                sss[j+1]=q;
            }
        }
        System.out.println(Arrays.toString(sss));
//        for (int n :sss){
//            System.out.println(n);
//        }
    }
}
