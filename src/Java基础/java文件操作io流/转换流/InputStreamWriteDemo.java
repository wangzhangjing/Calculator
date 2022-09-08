package Java基础.java文件操作io流.转换流;

import java.io.*;

public class InputStreamWriteDemo {
    public static void main(String[] args) throws Exception{
        //提取Gbk元素内容
        OutputStream fr =new FileOutputStream("./src/ddd1.txt");
        //把原始字节流转化为字符输入流
//        Reader isr=new InputStreamReader(fr);//默认Utf-8方式转换字符流，还是会乱码
        Writer isr=new OutputStreamWriter(fr,"GBK");//默认Utf-8方式转换字符流，解决乱码
        BufferedWriter br =new BufferedWriter(isr);
        br.write("你觉得就问你");
        br.newLine();
        br.write("的大框架五年");
        br.newLine();
        br.write("wdjqwjj");
        br.close();
    }
}
