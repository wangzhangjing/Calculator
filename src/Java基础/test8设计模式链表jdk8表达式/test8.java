package Java基础.test8设计模式链表jdk8表达式;
/*静态代理
代理模式为其他对象提供一种代理以控制这个对象的访问
* 代理模式说白了就是“真实对象”的代表，在访问对象时引入一定程度的间接性
* 因为这种间接性附件多种用途*/
public class test8 {
    public static void main(String[] args) {
        Action a=new UserAction();
        ActionnProxy proxy=new ActionnProxy(a);
        proxy.doAction();
    }
}
class ActionnProxy implements Action{

    private Action target;//被代理的对象
    public ActionnProxy(Action target){
        this.target=target;
    }
    //执行操作
    public void doAction() {
        long startTime =System.currentTimeMillis();
        target.doAction();//执行真正的业务
        long endTime =System.currentTimeMillis();
        System.out.println("共耗时="+(endTime-startTime));
    }
}

interface Action{
    public void doAction();
}

class UserAction implements Action{

    @Override
    public void doAction() {
        for (int i = 0; i < 100; i++) {
            System.out.println("用户开始工作。。");
        }

    }
}