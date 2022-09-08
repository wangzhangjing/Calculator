package Java基础.java文件操作io流.序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String []args)throws Exception{
        //创建对象字节输入流管道
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/ddd3.txt"));
        //调用对象字节输入流的反序列号方法
        Student o = (Student) ois.readObject();
        System.out.println(o.toString());
    }
}
