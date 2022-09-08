package Java基础.java文件操作io流.缓冲流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：完成出师表的顺序，并存入另一个文件中去
 */
public class BufferedCharTest {
    public static void main(String[] args) {
        try( //创建缓存字符与源文件相通
             BufferedReader br=new BufferedReader(new FileReader("./src/java文件操作io流/csb.txt"));
             //定义缓存输出管道与文件相通
             BufferedWriter bw =new BufferedWriter(new FileWriter("./src/java文件操作io流/csb2.txt"));) {

            //定义list集合存储每一行数据
            List<String> list=new ArrayList<>();
            //循环按照行存储
            String lien;
            while ((lien=br.readLine())!=null){
                list.add(lien);
            }
            System.out.println(list);
            List<String> sizes=new ArrayList<>();
            Collections.addAll(sizes,"一","二","三","四","五","陆","柒","八","九","十","十一");
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    //01 八

                    //02 七
                    return sizes.indexOf(o1.substring(0,o1.indexOf(".")))-sizes.indexOf(o2.substring(0,o2.indexOf(".")));
                }
            });//自定义排序规则排序
            System.out.println(list);

            //遍历集合美韩文章
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
