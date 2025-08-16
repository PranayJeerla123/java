import java.util.*;
class A{
  static Scanner sc=new Scanner(System.in);
  A(int a,String b){
    System.out.println(a+" "+b);
  }
  float m1(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
}
abstract class B extends A{
  B(short a,long b,float c){
    super(sc.nextInt(),sc.next());
     System.out.println(a+" "+b+" "+c);
  }
  abstract int m2(String a);
  abstract String m3(float a);
  boolean m4(int a){
     System.out.println(a);
     return sc.nextBoolean();
  }
}
class Cc extends B{
   Cc(){
    super(sc.nextShort(),sc.nextLong(),sc.nextFloat());
   }
   int m2(String a){
      System.out.println(a);
      return sc.nextInt();
   }
   String m3(float a){
      System.out.println(a);
      return sc.next();
   }
   public static void main(String []args){
     Cc obj =new Cc();
      System.out.println(obj.m1(sc.nextBoolean()));
      System.out.println(obj.m2(sc.next()));
      System.out.println(obj.m3(sc.nextFloat()));
      System.out.println(obj.m4(sc.nextInt()));
   }
}