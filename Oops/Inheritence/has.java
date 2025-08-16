import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   String m1(int a){
     System.out.println(a);
     return sc.next();
   }
   float m2(boolean a){
     System.out.println(a);
     return sc.nextFloat();
   }
   int m3(String a){
     System.out.println(a);
     return sc.nextInt();
   }
}
class B extends A{
   A obj=new A();
   boolean m4(float a){
     System.out.println(a);
     System.out.println(obj.m1(A.sc.nextInt()));
     return A.sc.nextBoolean();
   }
   long m5(String a){
      System.out.println(a);
      System.out.println(obj.m3(sc.next()));
      return A.sc.nextLong();
   }
   float m6(long a){
      System.out.println(a);
      return A.sc.nextFloat();
   }
   public static void main(String []args){
      B obj2=new B();
      System.out.println(obj2.m4(A.sc.nextFloat()));
      System.out.println(obj2.m5(A.sc.next()));
   }
   
}