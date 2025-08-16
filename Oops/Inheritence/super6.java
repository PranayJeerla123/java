import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   A(float a){
      System.out.println(a);
       System.out.println(this.a);
   }
   A(int x){
      this(sc.nextFloat());
      System.out.println(x);
   }
   void m1(){
     System.out.println(this.a);
   }
}
class B extends A{
   String a=sc.next();
   B(boolean x){
     super(sc.nextInt());
     System.out.println(x);
   }
   String m2(float x){
      System.out.println(x);
      return sc.next();
   }
   void m1(){
     System.out.println(this.a);
     System.out.println(super.a);
     super.m1();
     System.out.println(this.m2(sc.nextFloat()));
   }
   public static void main(String []args){
      B obj=new B(sc.nextBoolean());
      obj.m1();
   }
   
}