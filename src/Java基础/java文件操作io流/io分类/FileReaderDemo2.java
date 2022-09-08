package Java基础.java文件操作io流.io分类;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String []args) throws Exception {
        //每次读取一个字符
        Reader fr=new FileReader("./src/java文件操作io流/data03.txt");
        //有循环读取一个字符数组对象、
        char[] buffer =new char[1024];//1k字符
        int len;
        while ((len=fr.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }
    }
}
