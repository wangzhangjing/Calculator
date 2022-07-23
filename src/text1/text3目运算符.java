package text1;

import java.util.Scanner;

public class text3目运算符 {
    public static void main(String[] args) {
        System.out.println("输入成绩:");
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        String x=a>60?"及格":"不及格";
        System.out.println(x);
    }
}
