import java.util.*;
class A{
   private static int a=20;
   static Scanner sc=new Scanner(System.in);
   static class B{
     String m1(int p){
      System.out.println(p);
      System.out.println(a);
      return sc.next();
     }
   }
   public static void main(String []args){
     
     B obj=new B();
     System.out.println(obj.m1(sc.nextInt()));
   }
}