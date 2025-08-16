import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   void m1(){
     System.out.print("hello");
   }
   int m1(String a){
      System.out.print(a);
      return sc.nextInt();
   }
   String m1(float a){  
      System.out.print(a);
      return sc.next();
   }
   public static void main(String []args){
    A obj= new A();
    obj.m1();
    System.out.print(obj.m1(sc.next()));
    System.out.print(obj.m1(sc.nextFloat()));
   }
}
