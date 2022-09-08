package Java基础.java文件操作io流.转换流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 代码编码与文件编码相同和不同情况
 */
public class CharSetTest {
    public static void main(String[] args) {
        try {
            //代码Utf-8读也是不会混乱
            Reader fr =new FileReader("./src/ddd.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
