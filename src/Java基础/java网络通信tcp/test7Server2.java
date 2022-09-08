package Java基础.java网络通信tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 开发Socket网络编程入门代码服务器，实现消息接收
 *
 */
public class test7Server2 {
    //定义一个静态的list集合存储当前全部在线的socket管道
    public static List<Socket> allOnlineSocket=new ArrayList<>();
     public static void main(String []args) throws IOException {
             System.out.println("服务端启动成功----------");
             //端口注册
             ServerSocket socketaaa =new ServerSocket(7777);


             //5按照行读取消息
             String msg;
             while (true){
                 //必须调用accept方法：等待接收客户端的socket连接请求，建立socker管道通信
                 Socket socket = socketaaa.accept();
                 System.out.println("上线了小老弟！！");
                 allOnlineSocket.add(socket);//上线完成
                 //创建一个独立的线程来单独处理这个管道
                 new ServiceReaderThread1(socket).start();
             }
     }
}
//多线程收消息
class ServiceReaderThread extends Thread {
    private Socket socket;

    public ServiceReaderThread(Socket socket) {
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
                System.out.println(Thread.currentThread()+"收到消息" + msg);
                //把这个消息进行端口转发给全部客户端socket管道
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把你提出，已经断开连接");
            test7Server2.allOnlineSocket.remove(socket);
//            e.printStackTrace();

        }
    }

    private void sendMsgToAll(String msg) throws Exception {
       for (Socket socket:test7Server2.allOnlineSocket){
           PrintStream ps =new PrintStream(socket.getOutputStream());
           ps.println(msg);
           ps.flush();
       }

    }
}