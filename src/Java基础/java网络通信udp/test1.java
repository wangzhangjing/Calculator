package Java基础.java网络通信udp;

import java.io.IOException;
import java.net.InetAddress;

public class test1 {
    public static void main(String[] args) throws IOException {
        //获取本机IP地址对象
        InetAddress ip1 =InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //获取域名ip对象
        InetAddress ip2 =InetAddress.getByName("www.baidu.com");
        System.out.println(ip2);

        //获取公网ip对象
        InetAddress ip3 =InetAddress.getByName("14.215.177.38");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //4.判断是否能通
        System.out.println(ip3.isReachable(5000));
    }


}
