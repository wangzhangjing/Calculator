package Java基础.java文件操作io流.测试;



import java.io.*;

public class ByteBufferTimeDemo {
    private static final String SRC_FILE ="D:\\BaiduNetdiskDownload\\1 瑞吉外卖项目.rar";
    private static final String DEST_FILE ="D:\\BaiduNetdiskDownload\\test\\";
    public static void main(String [] args){
//        copy01();//慢的离谱 out
        copy02();//好像还行 0.999但是在桶是8192的情况下和04差不多
        copy03();//不怎么行 6.1
        copy04();//完美 0.21


    }

    private static void copy03() {
        long startTime =System.currentTimeMillis();
        try(
                InputStream is=new FileInputStream(SRC_FILE);
                //创建一个文件输出管道与目标文件接通
                InputStream bis =new BufferedInputStream(is);
                OutputStream os =new FileOutputStream(DEST_FILE+"test3.rar");
                //只能放资源对象，用完会自动关闭自动调用close方法关闭即使出现异常也会关闭资源
                OutputStream bos=new BufferedOutputStream(os)
        ) {
            //定义变量记录每次读取的字节
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime =System.currentTimeMillis();
        System.out.println("使用低级字节流按照一个一个字节复制耗时："+(endTime-startTime)/1000.0+"s");
    }


    private static void copy04() {
        long startTime =System.currentTimeMillis();
        try (InputStream is=new FileInputStream(SRC_FILE);
             //创建一个文件输出管道与目标文件接通
             InputStream bis =new BufferedInputStream(is);
             OutputStream os =new FileOutputStream(DEST_FILE+"test4.rar");
             //只能放资源对象，用完会自动关闭自动调用close方法关闭即使出现异常也会关闭资源
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
        long endTime =System.currentTimeMillis();
        System.out.println("使用缓存字节流按照一个一个字节数组复制耗时："+(endTime-startTime)/1000.0+"s");
    }

    private static void copy02() {
        long startTime =System.currentTimeMillis();
        try (InputStream is=new FileInputStream(SRC_FILE);
             //创建一个文件输出管道与目标文件接通
             OutputStream os =new FileOutputStream(DEST_FILE+"test2.rar");
             //只能放资源对象，用完会自动关闭自动调用close方法关闭即使出现异常也会关闭资源

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
        long endTime =System.currentTimeMillis();
        System.out.println("使用低级字节流按照一个一个字节数组复制耗时："+(endTime-startTime)/1000.0+"s");
    }

    private static void copy01() {
        long startTime =System.currentTimeMillis();
        try(
                //创建低价的字节输入流与文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //创建低价的字节输出流
                OutputStream os=new FileOutputStream(DEST_FILE+"test1.rar")
                ) {
            //定义变量记录每次读取的字节
            int b;
            while ((b=is.read())!=-1){
                os.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime =System.currentTimeMillis();
        System.out.println("使用低级字节流按照一个一个字节复制耗时："+(endTime-startTime)/1000.0+"s");
    }
}
