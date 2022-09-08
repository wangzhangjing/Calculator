package Java基础.java网络通信tcp;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 拓展使用线程池优化实现通信。
 *
 */
public class test4 {

    //使用静态变量记住一个线程池对象
    private static ExecutorService pool =new ThreadPoolExecutor(3,
            5,
            6,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    public static void main(String []args){

        try {
            System.out.println("服务端启动成功----------");
            //端口注册
            ServerSocket socketeee =new ServerSocket(6666);
            //必须调用accept方法：等待接收客户端的socket连接请求，建立socker管道通信
            //5按照行读取消息
            while (true){
                Socket socket=socketeee.accept();
                System.out.println(socket.getRemoteSocketAddress()+"它上线了");
                //任务对象负责读取消息
                Runnable target =new test5(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
