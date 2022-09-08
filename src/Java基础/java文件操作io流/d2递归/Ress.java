package Java基础.java文件操作io流.d2递归;

public class Ress {
    public static int toNum;
    public static int lastBotNum;
    public static int lastCoNum;
    public static void main(String[] args){
        //拿钱买酒
        //对应静态成员变量
        buy(10);
        System.out.println("总数"+toNum);
        System.out.println("瓶子数"+lastBotNum);
        System.out.println("盖子数"+lastCoNum);
    }
    public static void buy(int money){
        //立马看可以买多少瓶
        int buyNumber =money/2; //5
        toNum+=buyNumber;

        //把盖子和瓶子换成钱
        //统计盖子和瓶子的数量
        int coverNum =lastCoNum +buyNumber;
        int botNum=lastBotNum+buyNumber;
        //统计换算的钱
        int allMoney=0;
        if (coverNum>=4){
            allMoney+= (coverNum/4)*2;
        }
        lastCoNum =coverNum%4;
        if (botNum>=2){
            allMoney+= (botNum/2)*2;
        }
        lastBotNum =botNum%2;
        if (allMoney>=2){
            buy(allMoney);
        }
    }
}
