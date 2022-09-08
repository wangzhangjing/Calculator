package Java基础.text5;

public class text6Object {
    public static void main(String[] args) {
      Student s =new Student(2,"wzg",4);
        System.out.println(s.toString());
        Student s3 =new Student(2,"wzg",4);
boolean v=s.equals(s3);
        System.out.println(v);


        String s1=new String("问问");
        String s2=new String("问问");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
class Student extends Object{
    private String name;
    private int sid;
    private int age;
    public Student(){}
    public Student(int sid,String name,int age){
        this.sid=sid;
        this.name=name;
        this.age=age;
    }
    //重写object的toString方法
    public String toString(){
     return "sid="+sid +"name="+name +"age="+age;
    }
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj instanceof Student){
            Student s=(Student) obj;
            if (!this.name.equals(s.name)){
                return false;
            }
            if (this.sid!=s.sid){
                return false;
            }
            if (this.age!=s.age){
                return false;
            }
            return true;
        }
        return false;
    }
}