import java.util.*;
interface I1{
  static Scanner sc=new Scanner(System.in);
  float m1(int a);
}
interface I2 extends I1{
  String m2(int a);
  default boolean m3(String a){
     System.out.println(a);
     return sc.nextBoolean();
  }
}
interface I3 extends I2{
   default float m4(int a){
     System.out.println(a);
     return sc.nextFloat();
   }
}
class A implements I3{
   public float m1(int a){
     System.out.println(a);
     return sc.nextFloat();
   }
   public String m2(int a){
     System.out.println(a);
     return sc.next();
   }
   public static void main(String []args){
     A obj=new A();
     System.out.println(obj.m1(sc.nextInt()));
     System.out.println(obj.m2(sc.nextInt()));
     System.out.println(obj.m3(sc.next()));
     System.out.println(obj.m4(sc.nextInt()));
   }
}