package Java基础.text1运算符及排序;

import java.util.Arrays;

public class text4maopaopaixu {
    public static void main(String[] args) {
        /*
        * 冒泡排序两两之间排序
第1遍[77, 53, 32, 23, 82, 14, 25, 66]
第2遍[53, 32, 23, 77, 14, 25, 66, 82]
第3遍[32, 23, 53, 14, 25, 66, 77, 82]
第4遍[23, 32, 14, 25, 53, 66, 77, 82]
第5遍[23, 14, 25, 32, 53, 66, 77, 82]
第6遍[14, 23, 25, 32, 53, 66, 77, 82]
第7遍[14, 23, 25, 32, 53, 66, 77, 82]
        * */
        int[]sss={77,53,32,23,82,14,25,66};
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
        }
    }

