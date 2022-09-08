package Java基础.java文件操作io流.CommonsIODemo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommonsIODemo {
    public static void main(String[] args) throws Exception{
        //完成文件复制
//        IOUtils.copy(new FileInputStream("./src/锦瑟.txt"),
//        new FileOutputStream("./src/js.txt"));
        //完成文件复制到文件夹下
//        FileUtils.copyFileToDirectory(new File("D:\\app\\workspace\\Calculator\\src\\锦瑟.txt"),new File("D:\\BaiduNetdiskDownload\\docker操作"));
   //完成文件夹复制到文件夹
//        FileUtils.copyDirectoryToDirectory(new File("D:\\test\\t1"),new File("D:\\test\\t2"));

        //删除功能
//        FileUtils.deleteDirectory(new File("D:\\test\\t2"));
    //NIO新io流jdk1.7推出
//        Files.copy(Paths.get(("D:\\test\\t1\\a.jpg")), Paths.get(("D:\\test\\t2\\a.jpg")));
        Files.deleteIfExists(Paths.get(""));//删除
    }
}
