import java.util.*;
class B{
   static Scanner sc=new Scanner(System.in);
   B(){
     System.out.println("Default constructor");
   }
   B(float a){
     System.out.println(a);
   }
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
    B obj1 = new B();
    B obj2 = new B(sc.nextFloat());
    obj1.m1();
    System.out.print(obj1.m1(sc.next()));
    System.out.print(obj1.m1(sc.nextFloat()));
   }
}
