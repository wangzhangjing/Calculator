package Java基础.java网络通信tcp;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 拓展使用线程池优化实现通信。
 *
 */
public class test3 {
    public static void main(String[] args) {
        //创建socket通信管道请求服务器连接
        //public socket(String host,int port)
        try {
            System.out.println("客户端启动成功");
            Socket socket=new Socket("127.0.0.1",6666);
            //2.socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os =socket.getOutputStream();

            //3.把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            //4.发送消息
            Scanner sc =new Scanner(System.in);
            while (true) {
                System.out.println("请说");
                String msg =sc.nextLine();
                if ("exit".equals(msg)){
                    break;
                }
                ps.println("我是tcp客户端我已经和你对接并发出要请:"+msg);
                ps.flush();
            }
//            ps.print("我是tcp客户端我已经和你对接并发出要请：约吗？");这样不行
//            ps.flush();
            Thread.sleep(3000);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
