package Java基础.java网络通信udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 *
 */
public class test3UDPServer2 {
    public static void main(String[] args) throws Exception {
        System.out.println("开始");
        //1创建接收端数据
    DatagramSocket socket =new DatagramSocket(8888);

    //创建一个接收数据包对象（韭菜盘子
        byte[] bu =new byte[1024 *64];
        DatagramPacket packet=new DatagramPacket(bu, bu.length);

        //3.等待接收数据
        socket.receive(packet);

        //取出数据
        //读取多少倒多少数据
        int len = packet.getLength();
        String rs = new String(bu,0,len);
        System.out.println("收到了"+rs);

        //获取发送端的ip和端口
        String ip = packet.getSocketAddress().toString();
        System.out.println("对方地址"+ip);
        int port = packet.getPort();
        System.out.println("对方地址"+ip+"对方端口"+port);
        //

        socket.close();
}
}