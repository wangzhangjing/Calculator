package Java基础.java文件操作io流.文件数据Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[]args)throws Exception{
        //使用Properties把键值存入到属性文件中
        Properties properties=new Properties();
        System.out.println(properties);
        properties.load(new FileReader("./src/user.properties"));
        System.out.println(properties);
        String dlei = properties.getProperty("dlei");
        System.out.println(dlei);
    }
}
