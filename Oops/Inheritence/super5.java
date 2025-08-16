import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   A(int x){
      System.out.println(x);
   }
   void m1(){
     System.out.println(a);
   }
}
class B extends A{
   String a=sc.next();
   B(boolean x){
     super(sc.nextInt());
     System.out.println(x);
   }
   void m1(){
     System.out.println(a);
     System.out.println(super.a);
     super.m1();
   }
   public static void main(String []args){
      B obj=new B(sc.nextBoolean());
      obj.m1();
   }
   
}