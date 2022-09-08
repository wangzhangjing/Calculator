package Java基础.java文件操作io流.d2递归;

import java.io.File;

public class Recu {
    public static void main(String []args){
         //1传入目录和名称
        search(new File("D:\\资料\\项目"),"over.png");
    }
    //2创造方法
    public static void search(File dir,String fileName){
        //3.判断dir是否是目录
        if (dir!=null&& dir.isDirectory()){
            //可以找
            //基于当前文件下的一级文件对象
            File[] files = dir.listFiles();
            //判断是否存在一级文件对象
            if (files!=null&& files.length>0){
                for (File file : files) {
                    if (file.isFile()){
                        //是不是要找的，是把其他路径输出即可
                        if (file.getName().contains(fileName)){
                            System.out.println("找到了"+file.getAbsolutePath());
                            //启动

//                            Runtime r=Runtime.getRuntime();
//                            try {
//                                r.exec(file.getAbsolutePath());
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
                            break;//关闭
                        }else {
                            search(file,fileName);
                        }
                    }

                }
            }else {
                System.out.println("对不起，你搜索的不是文件夹");
        }
        }

    }
}
