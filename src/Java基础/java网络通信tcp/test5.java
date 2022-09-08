package Java基础.java网络通信tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class test5 implements Runnable{
    private Socket socket;
    public test5(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {

        try {
            InputStream in = socket.getInputStream();
            BufferedReader br= new BufferedReader(new InputStreamReader(in));
            //5按照行读取消息
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress()+"说了"+msg);
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread()+"已经断开连接");
//            e.printStackTrace();
        }
    }
}
