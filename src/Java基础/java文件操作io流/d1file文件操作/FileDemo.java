package Java基础.java文件操作io流.d1file文件操作;

import java.io.File;

public class FileDemo {
    public static void main(String [] args){
        //创建file对象(指定文件路径)
        //路径写法1.D:\\资料\\项目\\over.png 2.D:/资料/项目/over.png
        //
        File f=new File("D:\\资料\\项目\\over.png");
        long length = f.length();//文件的字节大小
        System.out.println(length);
        //File创建对象，支持绝对路径，支持相对路径
        File f1=new File("D:/资料/项目/over.png");//绝对路径
        long length1 = f1.length();
        System.out.println(length1);
        //相对路径一般定位模块中的文件
        File f2=new File("./src/data.txt");
        long length2 = f2.length();
        System.out.println(length2);
        File f3=new File("D:/资料/项目");
        System.out.println(f3.exists());//判断路径是否存在
    }
}
