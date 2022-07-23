package text1;

public class text2 {
    public static void main(String[] args) {
        int []arr ={32,32,32,32,12,12,12,11};
        print66(arr);

    }

public static void print66(int[]arr){
        int eor=0;
//    for (int a :arr) {
//        eor ^=a;
//    }
    for (int i = 0; i <arr.length ; i++) {
        eor ^=arr[i];
        //eor=a^b
        //eor!=0
        //eor必有一个位置上是1  2进制位上必不同
    }
    int aw =eor &(~eor+1);//提取最右边的1
    /*
    eor:   1010111100
    ~eor:  0101000011
    ~eor+1:0101000100
    aw:  & 0000000100
    */
    int aq=0;
    for (int ca:arr) {
    if (( ca & aw)==0){
    aq ^=ca;
        }
    }
    System.out.println(aq+"两个不同的分别是"+(eor^aq));
}
}