package Java基础.java文件操作io流.io分类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[]args) throws Exception {
        //创建一个文件字节输入流
//        InputStream is =new FileInputStream(new File("./src/java文件操作io流/data.txt"));
        //简化写法
        InputStream is =new FileInputStream("./src/java文件操作io流/data.txt");
        //2读取字节
//        int b1=is.read();
//        System.out.println(b1);
//        System.out.println((char) b1);
//        int b2=is.read();
//        System.out.println((char) b2);
//        int b3=is.read();
//        System.out.println((char) b3);
//        int b4=is.read();
//        System.out.println(b4);
        //3使用循环改进
        //定义一个变量每次读取的字节
        int b;
        while ((b= is.read()) !=-1){
            System.out.print((char) b);
        }
    }
}
