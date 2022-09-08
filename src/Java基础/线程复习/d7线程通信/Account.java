package Java基础.线程复习.d7线程通信;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;




    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    public Account() {

    }
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money>=money){
                this.money-=money;
                System.out.println(name+"取了"+money+"成功，余额是"+this.money);
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void Depodit(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money==0){
                //没钱了存钱
                this.money+=money;
                System.out.println(name+"存了"+money+"成功，余额是"+this.money);

            }
            this.notifyAll();
            this.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



}
