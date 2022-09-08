package Java基础.text1运算符及排序;

import java.util.Arrays;

public class test9 {
    public static int[] main(int[] sss){
        for (int i=0;i<sss.length-1;i++){
            System.out.println("第"+(i+1)+"遍"+ Arrays.toString(sss));
            for (int j=0;j<sss.length-1-i;j++ ){
                if(sss[j]>sss[j+1]){
                    sss[j]=sss[j]+sss[j+1];
                    sss[j+1]=sss[j]-sss[j+1];
                    sss[j]=sss[j]-sss[j+1];
                }
            }
        }
        return sss;

    }
}
