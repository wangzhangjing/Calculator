package Java基础.java文件操作io流.io分类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 使用文件字节输入流，每次读取一个字节数组数据
 *
 */
public class FileInputStreamDemo2 {
    public static void main(String[]args) throws Exception {
        //创建一个文件字节输入流输入流管道与文件接通
        InputStream is=new FileInputStream("./src/java文件操作io流/data02.txt");
        //定义一个字节数组
//        byte[] buffer=new byte[1024];//1kb
//        byte[] buffer=new byte[3];
//        int read = is.read(buffer);
//        System.out.println("读取了几个字节："+read);
//        String rs =new String(buffer);
//        System.out.println(rs);
//        int read1 = is.read(buffer);
//        System.out.println("读取了几个字节："+read1);
//        String rs1 =new String(buffer);
//        System.out.println(rs1);
//        int read2 = is.read(buffer);
//        System.out.println("读取了几个字节："+read2);
//        //读多少到多少
//        String rs2 =new String(buffer,0,read2);
//        System.out.println(rs2);
//        int read3 = is.read(buffer);
//        System.out.println("读取了几个字节："+read3);
//        String rs3 =new String(buffer);
//        System.out.println(rs3);
        //3循环，每次读取一个字节
        byte[] buffer =new byte[3];
        int len;//记录每次读取的字节数
        while ((len=is.read(buffer))!=-1){
            //读多少倒多少
            System.out.println(new String(buffer,0,len));
        }
    }
}

