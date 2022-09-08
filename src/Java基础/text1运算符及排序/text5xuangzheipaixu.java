package Java基础.text1运算符及排序;

import java.util.Arrays;
/*
第1遍[14, 77, 53, 23, 82, 32, 25, 66]
第2遍[14, 23, 77, 53, 82, 32, 25, 66]
第3遍[14, 23, 32, 53, 82, 77, 25, 66]
第4遍[14, 23, 32, 53, 82, 77, 25, 66]
第5遍[14, 23, 32, 53, 66, 82, 77, 25]
第6遍[14, 23, 32, 53, 66, 25, 82, 77]
第7遍[14, 23, 32, 53, 66, 25, 77, 82]

 */

public class text5xuangzheipaixu {
    public static void main(String[] args) {
        int[]sss={77,53,32,23,82,14,25,66};
        int e=0;
        for (int i=0;i<sss.length-1;i++){
            e=i;
            for (int j=i+1;j<sss.length;j++ ){
                if (sss[e]>sss[j])
               e=j;


        if (e!=i) {
            sss[e]=sss[e]+sss[i];
            sss[i]=sss[e]-sss[i];
            sss[e]=sss[e]-sss[i];
        }}
            System.out.println("第"+(i+1)+"遍"+ Arrays.toString(sss));
        }
    }
}
