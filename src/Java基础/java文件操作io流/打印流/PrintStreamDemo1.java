package Java基础.java文件操作io流.打印流;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws Exception{
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
        System.out.println("沧海月明珠有泪");
        System.out.println("蓝田日暖玉生烟");
        System.out.println("此情可待成追忆");
        System.out.println("只是当时已惘然");

        PrintStream ps=new PrintStream("./src/锦瑟.txt");
        System.setOut(ps);//把系统打印流该成我们自己的打印流
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
        System.out.println("沧海月明珠有泪");
        System.out.println("蓝田日暖玉生烟");
        System.out.println("此情可待成追忆");
        System.out.println("只是当时已惘然");
    }
}
