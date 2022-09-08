package Java基础.线程复习.d1_create;

/**
 * 目标：学会线程创建方式2，（匿名内部类语法实现）
 */
public class ThreadDemo3 {
    public static void main(String[] args){
        //创建对象
        MyRunnable tar1 =new MyRunnable(){

                //重写run、方法
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("子线1程执行："+i);
                    }
                }
        };
        new Thread(new MyRunnable(){
            //重写run、方法
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线2程执行："+i);
                }
            }
        }).start();
        new Thread(()-> {for (int i = 0; i < 10; i++) {
            System.out.println("子线程3执行："+i);
        }}).start();
        //给线程对象
        new Thread(tar1).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行："+i);
        }
    }
}



