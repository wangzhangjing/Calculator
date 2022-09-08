package Java基础.java文件操作io流.io分类;

import java.io.*;

/**
 * 学会字节流学会文件复制
 */
public class CopyDemo {
    public static void main(String[]args) {
        //1一个字节输入流管道与原视频连接
        try {
            InputStream is=new FileInputStream("D:\\app\\workspace\\Calculator\\src\\data.txt");
            //创建一个文件输出管道与目标文件接通
            OutputStream os =new FileOutputStream("D:\\app\\workspace\\Calculator\\src\\new.txt");
            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
            //关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
