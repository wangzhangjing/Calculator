package text1;

/*一个数组起点为l  终点为r
求数组的中点  r+l/2可能会溢出数据 我们可以 用 l+(r-l)/2 还可以 l+(r-l)>>1 也可以

*/


import java.util.Arrays;

public class test3 {

    public static int getMax(int []aaa){
      return ssm(aaa,0,aaa.length-1);
    }


     public static int ssm(int []aa,int l,int r){
        if (l==r){
            return aa[l];
        }else {
            int mid = l+((r-l)>>1);//中点
            System.out.println(aa[mid]);
            int zuo =ssm(aa,l,mid);
            int you  =ssm(aa,mid+1,r);
            return Math.max(zuo,you);
        }
     }
    public static void getpx(int []aaa){
         px(aaa,0,aaa.length-1);
    }


    public static void px(int []aa,int l,int r){
        if (l==r){
            return;
        }else {
            int mid = l+((r-l)>>1);//中点
            System.out.println(aa[mid]);
            px(aa,l,mid);
            px(aa,mid+1,r);
            qq(aa,l,mid,r);}
        System.out.println(Arrays.toString(aa));
    }

    public static void qq(int[] ww,int q,int w,int e){
        int[]qaz=new int[e-q+1];
        int a=0;
        int p1=q;
        int p2=w+1;
        while (p1<=w && p2<=e){
            qaz[a++]=ww[p1]<=ww[p2] ? ww[p1++]:ww[p2++];
        }
        while (p1<=w){
            qaz[a++]=ww[p1++];
        }
        while (p2<=e){
            qaz[a++]=ww[p2++];
        }for (a=0;a<qaz.length;a++){
            ww[q+a]=qaz[a];
        }

    }
    public static int getxh(int []aaa){
        return xh(aaa,0,aaa.length-1);

    }


    public static int xh(int []aa,int l,int r){
        if (l==r){
            return 0;
        }
            int mid = l + ((r - l) >> 1);//中点

//        System.out.println(Arrays.toString(aa));
        return xh(aa,l,mid)+ xh(aa,mid+1,r)+ qqq(aa,l,mid,r);
    }

    public static int qqq(int[] ww,int q,int w,int e){
        int[]qaz=new int[e-q+1];
        int a=0;
        int p1=q;
        int p2=w+1;
        int r=0;
        while (p1<=w && p2<=e){
            r += ww[p1] < ww[p2] ? ww[p1]*(e-p2+1)  : 0;
            qaz[a++]=ww[p1]<=ww[p2] ? ww[p1++]:ww[p2++];
        }
        while (p1<=w){
            qaz[a++]=ww[p1++];
        }
        while (p2<=e){
            qaz[a++]=ww[p2++];
        }for (a=0;a<qaz.length;a++){
            ww[q+a]=qaz[a];
        }
return r;
    }
}
