package Java基础.java网络通信tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开发Socket网络编程入门代码服务器，实现消息接收
 *
 */
public class test2Server2 {
     public static void main(String []args){
         try {
             System.out.println("服务端启动成功----------");
             //端口注册
             ServerSocket socket =new ServerSocket(7777);
             //必须调用accept方法：等待接收客户端的socket连接请求，建立socker管道通信
             Socket socket1 = socket.accept();
             InputStream in = socket1.getInputStream();
             BufferedReader br= new BufferedReader(new InputStreamReader(in));
             //5按照行读取消息
             String msg;
             while ((msg = br.readLine()) != null){
                 System.out.println(socket1.getRemoteSocketAddress()+"说了"+msg);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}
