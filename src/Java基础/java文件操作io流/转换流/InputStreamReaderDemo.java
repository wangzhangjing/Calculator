package Java基础.java文件操作io流.转换流;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception{
        //提取Gbk元素内容
        InputStream fr =new FileInputStream("./src/ddd.txt");
        //把原始字节流转化为字符输入流
//        Reader isr=new InputStreamReader(fr);//默认Utf-8方式转换字符流，还是会乱码
        Reader isr=new InputStreamReader(fr,"GBK");//默认Utf-8方式转换字符流，解决乱码
        BufferedReader br =new BufferedReader(isr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
