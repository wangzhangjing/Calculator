package Java基础.java文件操作io流.io分类;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriterDemo {
    public static void main(String []args) throws Exception {
        //每次读取一个字符
        Writer fw=new FileWriter("./src/java文件操作io流/out1.txt",true);
        //写一个字符出去
        fw.write(98);
        fw.write('a');
        fw.write('徐');//字符流不会出问题
        fw.write("\r\n");
        //写字符串
        fw.write("abc我是中国人");
        fw.write("\r\n");
        //用char【】写一个字符数组出去
        char[] chars="kdwedj的那份金额".toCharArray();
        fw.write(chars);
        fw.write("\r\n");
        //写一部分
        fw.write(chars,3,5);
        fw.write("\r\n");
//        fw.flush();
        fw.close();
    }
}
