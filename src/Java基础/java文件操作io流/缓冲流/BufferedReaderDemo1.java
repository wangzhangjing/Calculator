package Java基础.java文件操作io流.缓冲流;

import java.io.*;

/**
 * 学会缓冲流提高输入流的性能，新增按照行读取的方法
 *
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args) throws Exception{
        Reader fr =new FileReader("./src/java文件操作io流/data03.txt");
        BufferedReader br=new BufferedReader(fr);
            //定义一个字节数组转移数据
//           char[] buffer=new char[1024];
//            int len;
//            while ((len=br.read(buffer))!=-1){
//                System.out.println(new String(buffer,0,len));
//            }
              String line;
              while ((line=br.readLine())!=null){
                  System.out.println(line);
              }
    }
}
