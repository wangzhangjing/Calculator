package Java基础.java网络通信tcp;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test8 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(8080);
            while (true){
                Socket socket=ss.accept();
                new ServiceReaderThread1(socket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ServiceReaderThread1 extends Thread {
    private Socket socket;

    public ServiceReaderThread1(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("content-type: text/html; charset=UTF-8");
            ps.println();
            ps.println("<span style='color:red;font-size:90px'>《数据库》</span>");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}