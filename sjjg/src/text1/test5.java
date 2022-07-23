package text1;
/*
* 堆 2叉树左边  2*i+1
* 右边 2*i+2
* 父节点(i-1)/2
*
* */
public class test5 {
    public static void main(String[] args) {

    }

    public static void heapSort(int[]arr){
        if (arr==null || arr.length<2){
            return;
        }

//        for (int i = arr.length-1; i >=0; i--) {//O(n)
//           heapify(arr,i, arr.length);
//        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize>0){//O(n)
            heapify(arr,0,heapSize);//O(logn)
            swap(arr,0,--heapSize);//O(1)
        }
    }
   //大根堆。。。。。。。。
    public static void heapInsert(int []arr,int index){
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
        }
    }
    public static void heapify(int[] arr,int index,int heapSize){
        int left = index * 2+1;//左孩子的下标，右孩子的下标就是左孩子加1
        while (left<heapSize){//下面还有孩子的时候
            //两个孩子中，谁大，把下标给largest
            int largest =left +1<heapSize &&arr[left+1]>arr[left]?
                    left+1:left;
            //父和孩子之间，谁的值大，把下标给largst
            largest =arr[largest]>arr[index]?largest:left;
            if (largest==left){
                break;
            }
            swap(arr,largest,index);
            index=largest;
            left=index*2+1;
        }
    }
    //交换工具类
    private static void swap(int[] arr, int index, int i) {
        int a=0;
        a=arr[index];
        arr[index]=arr[i];
        arr[i]=a;
    }
}
