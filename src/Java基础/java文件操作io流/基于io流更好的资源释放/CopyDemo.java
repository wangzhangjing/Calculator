package Java基础.java文件操作io流.基于io流更好的资源释放;

import java.io.*;

/**
 * 学会更好释放资源
 */
public class CopyDemo {
    public static void main(String[]args) {
        //1一个字节输入流管道与原视频连接
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream("D:\\app\\workspace\\Calculator\\src\\data.txt");
            //创建一个文件输出管道与目标文件接通
            os =new FileOutputStream("D:\\app\\workspace\\Calculator\\src\\new.txt");
            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
            System.out.println(10/0);
//            System.exit(0);//把虚拟机干掉
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //无论代码是否正常，还是出现异常最好都要执行这里
            System.out.println("weqwqw");
            //关闭流
            try {
                if (os!=null)os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is!=null)is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
