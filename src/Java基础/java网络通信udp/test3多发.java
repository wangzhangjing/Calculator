package Java基础.java网络通信udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class test3多发 {
    public static void main(String[] args) throws Exception {
        //1 创建发送端对象,发送端自带默认端口号
        DatagramSocket socket =new DatagramSocket(6666);

        //2创建一个数据包对象封装数据（韭菜盘子）
        Scanner sc =new Scanner(System.in);

        while (true) {
            System.out.println("请说:");
            String img = sc.nextLine();
            if ("exit".equals(img)){
                System.out.println("离线");
                socket.close();
                break;
            }
            byte[] bu =img.getBytes();
            DatagramPacket packet =new DatagramPacket(bu,bu.length, InetAddress.getLocalHost(),8888);

            //3发送数据
            socket.send(packet);
        }
        // STOPSHIP: 2022/8/27


    }
}
