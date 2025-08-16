import java.util.*;
abstract class A{
  
  static Scanner sc=new Scanner(System.in);
  A(int a){
    System.out.println(a);
  }
  abstract String m1(int a);
  abstract float m2(boolean a);
}
abstract class B extends A{
  B(String a){
    super(sc.nextInt());
    System.out.println(a);
  }
  abstract double m3(String a);
  int m4(float a){
     System.out.println(a);
     return sc.nextInt();
  }
}
class C extends B{
   C(){
     super(sc.next());
     System.out.println("C constructor");
   }
   String m1(int a){
     System.out.println(a);
     return sc.next();
   }
   float m2(boolean a){
      System.out.println(a);
      return sc.nextFloat();
   }
   double m3(String a){
     System.out.println(a);
      return sc.nextDouble();
   }
   public static void main(String []args){
     C obj = new C();
     System.out.println(obj.m1(sc.nextInt()));
     System.out.println(obj.m2(sc.nextBoolean()));
     System.out.println(obj.m3(sc.next()));
     System.out.println(obj.m4(sc.nextFloat()));
   }
}