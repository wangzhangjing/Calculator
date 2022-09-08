package Java基础.java网络通信tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标客户端一发一收
 * 1客户端发送消息
 * 2客户端随时可能需要收到消息
 */
public class test6Client {
    public static void main(String[] args) {
        //创建socket通信管道请求服务器连接
        //public socket(String host,int port)
        try {
            System.out.println("客户端启动成功");
            Socket socket=new Socket("127.0.0.1",7777);

            //创建一个独立的线程专门负责这个客户端的读消息（服务的随时可能发消息过来）
            new ClientReaderThread(socket).start();

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
                ps.println(msg);
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
//多线程收消息
class ClientReaderThread extends Thread {
    private Socket socket;

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //5按照行读取消息
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println("收到消息" + msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把"+Thread.currentThread().getName()+"线程提出，已经断开连接");
//            e.printStackTrace();
        }
    }
}