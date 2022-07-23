package text1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
//        System.out.println("从键盘上输入数字并用空格隔开");
//        Scanner sc = new Scanner(System.in);
//        String inputString = sc.nextLine();
//        String stringArray[] = inputString.split(" ");
//        int arr[] = new int[stringArray.length];
//        for (int i = 0; i < stringArray.length; i++) {
//            arr[i] = Integer.parseInt(stringArray[i]);
        //        yx(arr);//O(n^2)
//        mp(arr);//O(n^2)
//        cr(arr);//O(n^2)
//  ----------------------对数器------------
        int textTime =5000;
        int maxSize =100;
        int maxValue =100;
        boolean succeed =true;
            for (int j = 0; j < textTime; j++) {
                int[]arr1 = gwzj(maxSize,maxValue);
                int[]arr2 =copyArray(arr1);
                xtpx(arr1);
                cr(arr2);
                if (!isEquals(arr1,arr2)) {
                    succeed = false;//一旦有不一样的值就设为false;
                    break;

                }
                System.out.println(succeed ? "Success:恭喜你！没毛病！" : "Error：抱歉，有错误" );//没错就恭喜，有错就报错
                int[] newArr = gwzj(maxSize, maxValue);
                printArray(newArr);//没排序的数组打印出来
                cr(newArr);//排序后
                printArray(newArr);//再次打印，程序员自己看看有没有毛病
            }

        }
    //打印数组
    public static void printArray(int[] arr) {
        if(arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1 != null && arr2 == null || arr1 == null && arr2 != null) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        return true;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static int[] gwzj(int maxsize,int maxvalue){
        //Math.random()-> [0,1)所有小数，等概率返回一个
        //Math.random()*n ->[0,n)所有小数等概率返回一个
        //（int）Math.random()*n ->[0,n)所有整数等概率返回一个
            int[]arr =new int[(int)((maxsize+1)*Math.random())];//长度随机
            for (int i = 0; i <arr.length; i++) {
                arr[i]=(int)((maxvalue+1)*Math.random())-(int)(maxvalue*Math.random());
            }
            return arr;
        }

        public static void yx(int[]arr){//选择排序
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
          int min=i;
          for (int j=i+1;j<arr.length;j++){
              min=arr[min]>arr[j]?j:min;
          }
          swap1(arr,i,min);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void mp(int[]arr){//冒泡排序
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++ ){
                if (arr[j]>arr[j+1]){
                     swap1(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void cr(int[]sss) {
        if (sss == null || sss.length < 2) {
            return;
        }
        for (int i = 1; i < sss.length; i++) {
            for (int j = i - 1; j >= 0 && sss[j]>sss[j+1]; j--) {
                 swap(sss,j,j+1);
            }
        }
        System.out.println(Arrays.toString(sss));
    }

    public static void xtpx(int[]aaa){
        Arrays.sort(aaa);
    }


    public static void swap(int []arr,int i,int min){//交换i和min位置
        int a=arr[i];
        arr[i]=arr[min];
        arr[min]=a;
    }
    //不开劈空间更省内存更快
    public static void swap1(int []arr,int i,int min){//交换i和min位置、注意i必须不等于min
        /*   0^n=n;  n^n=0;
            满足结合律，和交换律
            a^b=b^a  (a^b)^c=c^(a^b)*/
        arr[i]=arr[i]^arr[min];//arr[i]  =  carr[min];
        arr[min]=arr[i]^arr[min];//arr[min]  =  arr[i]^arr[min]^arr[min] = arr[i]
        arr[i]=arr[i]^arr[min];//arr[i]  =  (arr[i]^arr[min])^(arr[i]^arr[min]^arr[min])  =
        // (arr[i]^arr[min])^arr[i]^0)  =  arr[i]^arr[min]^arr[i]=arr[i]^arr[i]^arr[min]=arr[min]

    }




}

