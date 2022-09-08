package Java基础.java网络通信udp;

import java.net.*;

/**
 * 发送端
 */
public class test2UDPClient1 {
    public static void main(String[] args) throws Exception {
        //1 创建发送端对象,发送端自带默认端口号
        DatagramSocket socket =new DatagramSocket(6666);

        //2创建一个数据包对象封装数据（韭菜盘子）
        /*
        * 参数一要封装发送的数据
        * 参数2发送的数据大小
        * 参数3服务的的ip地址
        * 参数4服务的的IP地址
        * */
        byte[] bu ="水水水水水水水水水水水".getBytes();
        DatagramPacket packet =new DatagramPacket(bu,bu.length, InetAddress.getLocalHost(),8888);

        //3发送数据
        socket.send(packet);
        // STOPSHIP: 2022/8/27
        socket.close();

    }
}
