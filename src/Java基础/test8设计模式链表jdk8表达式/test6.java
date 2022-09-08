package Java基础.test8设计模式链表jdk8表达式;

public class test6 {
    public static void main(String[] args) {
        Student s = new Student(2,"ewdjioe",19);
        System.out.println(s);
    }
}

class Student{
    private String name;
    private int sid;
    private int age;
    public Student(){}
    public Student(int sid,String name,int age){
        this.sid=sid;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "sid="+sid+",name="+name+",age="+age;
    }
}