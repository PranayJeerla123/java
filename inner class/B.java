import java.util.*;
class B{
   static Scanner sc=new Scanner(System.in);
   B(float a,String b){
       System.out.println(a+" "+b);
     }
   String m1(int p){
      System.out.println(p);
      return sc.next();
     }
   static class C{
     float m2(boolean p){
      System.out.println(p);
      return sc.nextFloat();
     }
   }
   public static void main(String []args){
     B bb=new B(sc.nextFloat(),sc.next());
     C cc=new C();
     System.out.println(bb.m1(sc.nextInt()));
     System.out.println(cc.m2(sc.nextBoolean()));
   }
}