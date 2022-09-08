package Java基础.java文件操作io流.io分类;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用文件字节输入流，每次读取文件全部字节
 *
 */
public class FileInputStreamDemo3 {
    public static void main(String[]args) throws Exception{
        //定义一个字节数组与文件大小一样。
        File f=new File("./src/java文件操作io流/data03.txt");
        InputStream is=new FileInputStream("./src/java文件操作io流/data03.txt");
        //获取文件大小
        byte[] buffer=new byte[(int) f.length()];
        int read = is.read(buffer);
        System.out.println("读取了多少个字节"+read);
        System.out.println("文件大小"+f.length());
        System.out.println(new String(buffer,0, (int) f.length()));
    }
}

