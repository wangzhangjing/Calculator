package Java基础.线程复习.d4zdbck安全锁;

/**
 * 取钱类
 *
 */
public class DrawThread extends Thread{
    private Account account;

    public DrawThread(Account account){
        this.account=account;
    }
    public DrawThread(Account account, String name){
        super(name);
        this.account=account;
    }
    @Override
    public void run() {
        //取钱
        account.drawMoney(100000);
    }
}
