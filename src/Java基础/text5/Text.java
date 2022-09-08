package Java基础.text5;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        ImportCosmeticManager cm =new ImportCosmeticManager();
        cm.add(new Cosmetic("香奈儿","进口",1000));
        cm.add(new Cosmetic("圣罗兰","进口",800));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.add(new Cosmetic("万紫千红","国产",50));
        cm.pringInfo();
    }
}
//可以输出进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager{
   public void pringInfo(){
       //比较两个字符串是否相同，不能使用== 使用equals方法
       for (int i=0;i<count;i++){
           if ("进口".equals(s[i].getType())){
               System.out.println(s[i].getInfo());
           }
       }
   }

}
//可以按照单价排序
class SortCosmeticManager extends CosmeticManager{
    public void pringInfo(){
        Cosmetic[] t =Arrays.copyOf(s,count);
        Cosmetic c =null;
        for (int i=0;i<t.length-1;i++){
            for (int j=0;j<t.length-1-i;j++){
                if (t[j].getPrice()>t[j+1].getPrice()){
                    c=t[j];
                    t[j]=t[j+1];
                    t[j+1]=c;
                }
            }
        }
        for (Cosmetic cos:t
             ) {
            System.out.println(cos.getInfo());
        }
    }
}
//化妆品管理类
class CosmeticManager{
    protected Cosmetic[]s =new Cosmetic[4];
    protected int count=0;
    //进货
    public void add(Cosmetic c){
        int a=s.length;
        if (count>=a){
            int newLen=a*2;
            s = Arrays.copyOf(s,newLen);
        }
        s[count]=c;
        count++;
    }
    public void pringInfo(){
        for (int i =0;i<count;i++){
            System.out.println(s[i].getInfo());
        }
    }
}
//化妆品类
class Cosmetic{
    private String name;
    private String type;
    private int price;
    public  Cosmetic(){

    }
    public  Cosmetic(String name,String type,int price){
       this.name=name;
       this.type=type;
       this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }
    public String getInfo(){
        return "name:"+name+",type"+type+"price"+price;
    }

}