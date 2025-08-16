import java.util.*;
class P{
  static Scanner sc=new Scanner(System.in);
  boolean m1(float a){
        System.out.println(a);
        return sc.nextBoolean();
  }
  static class Q{
    static String m2(int a){
      System.out.println(a);
      class R{
        boolean m3(float a){
          System.out.println(a);
          return sc.nextBoolean();
        }
      }
      
      R rr=new R();
      System.out.println(rr.m3(sc.nextFloat()));
      return sc.next();
    }
}
    class S{
         int m4(String a){
           System.out.println(a);
           return sc.nextInt();
         }
        }
}
class Test{
  public static void main(String []args){
    P pp=new P();
   System.out.println(pp.m1(P.sc.nextFloat()));
   
   System.out.println(P.Q.m2(P.sc.nextInt()));
   P.S ss=pp.new S();
   System.out.println(ss.m4(P.sc.next()));
  }
}