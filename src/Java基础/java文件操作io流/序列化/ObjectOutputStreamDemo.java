package Java基础.java文件操作io流.序列化;

import java.io.*;

/**
 * 学会序列化，使用ObjectOutputStream把内存中的对象存储到磁盘文件中
 * 对象想序列号对象类  必须实现Serializable接口
 */

public class ObjectOutputStreamDemo  {
    public static void main(String[]args) throws Exception {
        Student s=new Student("呃呃","xhekk","1314520",21);
        //2对象序列号
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/ddd3.txt"));
        //序列化方法
        oos.writeObject(s);
        oos.close();
        System.out.println("序列化完成");
    }
}
