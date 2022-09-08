package Java基础.java文件操作io流.d2递归;

/**
 * f(x)-f(x)/2-1 =f(x+1)
 * f(x)-2=2f(x+1)
 * f(x)=2f(x+1)+2
 * 求f（1）
 * f(10)=1
 */
public class Fain {
    public static void main(String[] args){
        int qqq = qqq(4);
        System.out.println(qqq);
        System.out.println(z(10));
    }
    public static int qqq(int s){
        if (s==1){
            return 1;
        }
        return s+qqq(s-1);
    }

    public static int z(int d){
        if (d==1){
            return 1;
        }
        return 2+2*z(d-1);
    }
    public static int e(int d){
        if (d==10){
            return 1;
        }
        return 2+2*z(d+1);
    }
}
