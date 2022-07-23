package text2;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {


    System.out.println("从键盘上输入数字并用空格隔开");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    String stringArray[] = inputString.split(" ");
    int num[] = new int[stringArray.length];
         for (int i = 0; i < stringArray.length; i++) {
        num[i] = Integer.parseInt(stringArray[i]);
        System.out.println(stringArray[i]);
    }
}
 }