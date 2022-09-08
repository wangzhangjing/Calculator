package Java基础.java文件操作io流.文件数据Properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[]args)throws Exception{
        //使用Properties把键值存入到属性文件中
        Properties properties=new Properties();
        properties.setProperty("admin","123456");
        properties.put("dlei","003197");
        properties.put("wang","123123");
        System.out.println(properties);
        //参数一，保存的管道
        //参数2，保存心得，可以不写
        properties.store(new FileWriter("./src/user.properties"),"hahaha this is users!! im very happy!");
    }
}
