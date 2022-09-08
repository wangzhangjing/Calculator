package Java基础.text5;

import java.util.Scanner;

public class game {

    public static void main(String[] args) {
       int q = (int)(Math.random()*100);
        int i=q+1;
        System.out.println("请输入一个数");
        for (int j = 0; j < 9; j++) {
            Scanner sc = new Scanner(System.in);
            Integer s = Integer.valueOf(sc.nextLine());
            if (i==s){
                System.out.println("恭喜你第"+j+"次猜对了！");
                break;
            }else if (i<s){
                System.out.println("大了，大了");
            }else {
                System.out.println("小了，小了");
            }
            if (j==8){
                System.out.print("你失败了");
                break;
            }

        }


    }

}
