package Java基础.线程复习.d3安全锁;

public class Account {
    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    public Account() {

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

    public void drawMoney(double money) {
        //获取哪个人来取钱
        String name = Thread.currentThread().getName();
        //同步代码块
        synchronized (this) {
            //获取账号余额
            if (this.money>=10000){
                System.out.println(name+"来取钱成功，取了"+money);
                this.money-=money;
                System.out.println(name+"来取钱成功后，还有"+this.money);
            }else {
                System.out.println(name+"来取钱成功,余额不足");
            }
        }
    }
}
