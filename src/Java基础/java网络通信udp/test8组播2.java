package Java基础.java网络通信udp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class test8组播2 {
    public static void main(String[] args) throws Exception {
        System.out.println("开始");
        //1创建接收端数据
        MulticastSocket socket =new MulticastSocket(9999);

        //把当前接收端加入组播中去 绑定对应组播ip
        socket.joinGroup(InetAddress.getByName("224.0.1.1"));


        //创建一个接收数据包对象（韭菜盘子
        byte[] bu =new byte[1024 *64];
        DatagramPacket packet=new DatagramPacket(bu, bu.length);

        while (true){
            //3.等待接收数据
            socket.receive(packet);

            //取出数据
            //读取多少倒多少数据
            int len = packet.getLength();
            String rs = new String(bu,0,len);
            System.out.println("收到了来自"+packet.getAddress()+"端口"+packet.getPort()+"的回复："+rs);
            if ("quit".equals(rs)){
                System.out.println("退出");
                socket.close();
                break;
            }
        }
        //


    }
}
