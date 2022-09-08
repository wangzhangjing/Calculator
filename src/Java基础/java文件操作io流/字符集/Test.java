package Java基础.java文件操作io流.字符集;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * 目标：学会进行文字的编码和解码，为以后可能用到的场景做准备
 *
 */
public class Test {
    public static void main(String[]args) throws Exception {
        //编码把文字转化为字节
        String name="abc我爱你中国";
        byte[] bytes = name.getBytes("GBK");//以当前代码默认字符集进行编码（UTF-8）
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        //解码，把字节转换为对应的中文形式
//        String rd =new String(bytes);//默认UTF-8
        String rd=new String(bytes,"GBK");
        System.out.println(rd);
    }
}
