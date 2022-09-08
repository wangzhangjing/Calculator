package Java基础.java文件操作io流.io分类;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        //创建一个文件输出流与目标文件接通
//        OutputStream os=new FileOutputStream("./src/java文件操作io流/out.txt");//先清空数据后，写入
        OutputStream os=new FileOutputStream("./src/java文件操作io流/out.txt",true);//直接写入
        //写数据出去
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes());
//        os.write('徐');//一个字节写中文会乱码
        byte[] buffer ={'a',98,99,97};
        os.write(buffer);
        os.write("\r\n".getBytes());
        byte[] buffer1 ="我是中国人".getBytes();
        os.write(buffer1);
        os.write("\r\n".getBytes());

        byte[] buffer2 ={'a',98,99,97};
        os.write(buffer2);

        //写数据必须刷新数据
//        os.flush();//写数据必须刷新数据，刷新后可以继续使用流
        os.close();//释放资源，包含刷新
    }
}
