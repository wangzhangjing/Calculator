package text3;

public class six {
    public static void main(String[] args) {
       Duck d = new Duck();
       method(d);
       System.out.println("Duck age="+d.age);
    }
   public static void method(Duck duck){
        duck.age=5;
   }
}
class Duck{
    int age=2;
}