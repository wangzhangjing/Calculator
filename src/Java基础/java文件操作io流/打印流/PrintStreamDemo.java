package Java基础.java文件操作io流.打印流;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception{
//        PrintStream ps =new PrintStream(new FileOutputStream("./src/ps.txt"));
//        PrintStream ps =new PrintStream("./src/ps.txt");//不能追加
        PrintStream ps =new PrintStream(new FileOutputStream("./src/ps.txt",true));
        ps.println(95);
        ps.println('s');
        ps.println("dad");
        ps.println(true);
        ps.println(32.1);
        ps.close();
//        PrintWriter ps1 =new PrintWriter("./src/ps.txt");
//        ps1.println(95);
//        ps1.println('s');
//        ps1.println("dad");
//        ps1.println(true);
//        ps1.println(32.1);
//        ps1.close();
    }
}
