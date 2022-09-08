package Java基础.java文件操作io流.d1file文件操作;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String [] args){
        //创建file对象(指定文件路径)
        //路径写法1.D:\\资料\\项目\\over.png 2.D:/资料/项目/over.png
        //
        File f=new File("D:/资料/项目/over.png");
        System.out.println(f.length());//文件的字节大小
        System.out.println(f.getAbsolutePath());//获取它的绝对路径
        System.out.println(f.getPath());//获取它的相对路径
        System.out.println(f.getName());
        long time =f.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        System.out.println(f.isDirectory());//判断是否为文件夹
        System.out.println(f.isFile());//判断是否是文件
        File f1=new File("D:/");
        System.out.println(f1.isDirectory());
    }
}
