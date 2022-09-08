package Java基础.线程复习.d2;

public class ThreadDemo2 {
    public static void main(String [] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==3){
                Thread.sleep(3000);
            }
        }
    }
}
