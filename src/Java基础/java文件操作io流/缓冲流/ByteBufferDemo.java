package Java基础.java文件操作io流.缓冲流;



import java.io.*;

/**
 * 目标使用字节缓存流完成数据读写
 */
public class ByteBufferDemo {
    public static void main(String[] args){
        //1一个字节输入流管道与原视频连接
        try (InputStream is=new FileInputStream("D:\\app\\workspace\\Calculator\\src\\data.txt");
             //把原始的字节输入流包装成高级的缓存字节输入流
             InputStream bis=new BufferedInputStream(is);
             //创建一个文件输出管道与目标文件接通
             OutputStream os =new FileOutputStream("D:\\app\\workspace\\Calculator\\src\\new1.txt");
             //把原始的字节输出流包装成高级的缓存字节输出流
             OutputStream bos=new BufferedOutputStream(os)
        ){

            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
