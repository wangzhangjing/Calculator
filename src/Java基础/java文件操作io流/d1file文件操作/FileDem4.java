package Java基础.java文件操作io流.d1file文件操作;

import java.io.File;
import java.io.IOException;

public class FileDem4 {
    public static void main(String [] args) throws IOException {
        //创建file对象(指定文件路径)
        //路径写法1.D:\\资料\\项目\\over.png 2.D:/资料/项目/over.png
        //
        File f=new File("D:/资料/项目");
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }
        File f1=new File("D:/资料/项目");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
