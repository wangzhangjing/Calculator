package Java基础.java文件操作io流.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws Exception{
        //每次读取一个字符
        Writer fw=new FileWriter("./src/java文件操作io流/out2.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        //写一个字符出
        bw.write(98);
        bw.write('a');
        bw.write('徐');//字符流不会出问题
        bw.newLine();
        //写字符串
        bw.write("abc我是中国人");
        bw.newLine();
        //用char【】写一个字符数组出去
        char[] chars="kdwedj的那份金额".toCharArray();
        bw.write(chars);
        bw.newLine();
        //写一部分
        bw.write(chars,3,5);
        bw.newLine();
//        fw.flush();
        bw.close();
    }
}
