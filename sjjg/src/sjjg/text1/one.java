package sjjg.text1;

public class one {
    /*
    栈的大小
    * */
    private int maxStack;
    /*数组模拟栈
     * */
    private int[] stack;
    /*
    表示栈顶的位置，没有数据时默认情况下使用-1
     * */
    private int top=-1;

    public one (int maxStack){
        this.maxStack=maxStack;

    }
       /*
    压栈*/
    public void push(int val){
        if (isFul()){
            throw new RuntimeException("此栈已满");
        }
        top++;
        stack[top]=val;
    }



    /* 判断当前栈是否满栈
    * */
    public boolean isFul(){
        return this.top==this.maxStack-1;

    }
    /* 判断当前栈是否空栈
     * */
    public boolean isEmpty(){
        return this.top==-1;

    }
    /*弹栈
    */
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("空栈，没有数据");
        }
        int value = stack[top];
        top--;
        return value;
    }
}
