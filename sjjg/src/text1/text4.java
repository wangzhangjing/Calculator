package text1;

import java.util.Arrays;

public class text4 {
    /**
     * 合并数组
     * @param array
     * @param left
     * @param mid
     * @param right
     */
    public static void merge(int[] array,int left,int mid,int right){
        int s1 = left;
        int s2 = mid+1;
        int [] res = new int[right-left+1];
        int i=0;
        while(s1 <= mid && right >=s2){
            /*if(array[s1] <= array[s2]){
                res[i++] = array[s1++];
            }else {
                res[i++] = array[s2++];
            }*/
            res[i++]= array[s1] <= array[s2] ? array[s1++] :array[s2++];
        }
        while(s1 <= mid){
            res[i++] = array[s1++];
        }
        while(s2 <= right){
            res[i++] = array[s2++];
        }
        System.arraycopy(res,0,array,0+left,res.length);
    }

    /**
     * 分解数组
     * @param array
     * @param left
     * @param right
     */
    public static void mergeSort(int array[],int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)>>>1;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);//合并
        System.out.println(Arrays.toString(array));
    }

}
