package Java基础.线程复习.d7线程通信;


/**
 * 取钱类
 *
 */
public class DepositThread extends Thread{
    private Account account;

    public DepositThread(Account account){
        this.account=account;
    }
    public DepositThread(Account account, String name){
        super(name);
        this.account=account;
    }
    @Override
    public void run() {
       while (true){
           account.Depodit(10000);
           try {
               Thread.sleep(3000);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }
}
