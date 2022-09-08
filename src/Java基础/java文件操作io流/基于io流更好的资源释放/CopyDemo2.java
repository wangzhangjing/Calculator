package Java基础.java文件操作io流.基于io流更好的资源释放;

import java.io.*;

/**
 * 学会更好释放资源
 */
public class CopyDemo2 {
    public static void main(String[]args) {
        //1一个字节输入流管道与原视频连接
        try ( InputStream is=new FileInputStream("D:\\app\\workspace\\Calculator\\src\\data.txt");
              //创建一个文件输出管道与目标文件接通
              OutputStream os =new FileOutputStream("D:\\app\\workspace\\Calculator\\src\\new.txt");
                //只能放资源对象，用完会自动关闭自动调用close方法关闭即使出现异常也会关闭资源
              MyConnection connection=new MyConnection();//自动调用资源的释放方法

        ){

            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnection implements AutoCloseable{

    @Override
    public void close() throws IOException {
        System.out.println("资源被成功释放");
    }
}