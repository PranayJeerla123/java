import java.util.*;
class B{
   static Scanner sc=new Scanner(System.in);
   void m1(){
     try{
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(a/b);
     }
     catch(ArithmeticException e){
       System.out.println(e);
     }
   }
   void m2(){
     String a=sc.next();
     String b=sc.next();
     try{
       int x=Integer.parseInt(a);
       int y=Integer.parseInt(b);
       System.out.println(x*y);
     }
     catch(NumberFormatException e){
       System.out.println(e);
     }
   }
   void m3(){
     try{
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(a+b);
     }
     catch(InputMismatchException e){
       System.out.println(e);
     }
   }
   public static void main(String []args){
      B obj=new B();
      obj.m1();
      obj.m2();
      obj.m3();
   }
}