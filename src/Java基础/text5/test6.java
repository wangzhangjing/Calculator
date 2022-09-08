package Java基础.text5;

public class test6 {
//    public static void main(String[] args) {
////        Integer integ =new Integer(9);
////        boolean a=integ instanceof Object;
//        float round = Math.round(11.5);
//        System.out.println(round);
//
     public static void main(String[] args) {

         Per a=new cid();
         cid b=new cid();
         System.out.println(a.med(100,50));
         System.out.println(b.med(100,50));
         String c="a";
         String d=new String("a");
         System.out.println(c==d);
     }
    }
    class Per{
        public int med(int a,int b){
            return a-b;
        }
    }
    class cid extends Per{
        public int med(int a,int b){
          return a+b;
        }


    }
//    public class ChianClass{
//
//    }

