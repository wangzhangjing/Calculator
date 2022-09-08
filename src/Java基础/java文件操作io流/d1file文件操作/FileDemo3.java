package Java基础.java文件操作io流.d1file文件操作;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String [] args) throws IOException {
        //创建file对象(指定文件路径)
        //路径写法1.D:\\资料\\项目\\over.png 2.D:/资料/项目/over.png
        //
        File f=new File(".\\src\\data.txt");
        System.out.println(f.createNewFile());
        File f1=new File(".\\src\\data1.txt");
        System.out.println(f1.createNewFile());//几乎不会创建文件

        //创建一级目录
        File f2=new File("D:/资料/项目/aaa");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);
        //创建多级目录
        File f3=new File("D:/资料/项目/ccc/ddd/bbb");
        boolean mkdir1 = f3.mkdirs();
        System.out.println(mkdir1);
        //删除目录
        File f4=new File("./src/data1.txt");
        System.out.println(f4.delete());//占用一样删除
        File f5=new File("D:/资料/项目/aaa");
        System.out.println(f5.delete());//占用一样删除
    }
}
