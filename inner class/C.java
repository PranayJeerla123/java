import java.util.*;
class C{
   private int a=20;
   static Scanner sc=new Scanner(System.in);
   class D{
     D(float a){
       System.out.println(a);
     }
     String m1(int p){
      System.out.println(p);
      System.out.println(a);
      return sc.next();
     }
   }
   public static void main(String []args){
     C cc=new C();
     D obj=cc.new D(sc.nextFloat());
     System.out.println(obj.m1(sc.nextInt()));
   }
}