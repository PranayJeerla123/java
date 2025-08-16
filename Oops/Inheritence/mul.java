/*create a java application where we have one class which contains static variable and non static variable
and non static method with para and return type then inherit this class in another class which contains contains whose static 
variable and statuc method with para and return type then inherit this class in another class which contains 
two non static var and one static var non static method with para and return type then inherit this class in 
another class which contains non static and static variable ,static method with para and return type then access all these
properties in main method */

import java.util.*;
class A{
  static Scanner sc=new Scanner(System.in);
  static String a=sc.next();
  int b=sc.nextInt();
  String m1(int x){
    System.out.println(x);
    return sc.next();
  }
}
class B extends A{
  static float c=sc.nextFloat();
  static boolean m2(String x){
    System.out.println(x);
    return sc.nextBoolean();
  }
}
class C extends B{
  static long d=sc.nextLong();
  int e=sc.nextInt();
  String f=sc.next();
  long m3(int x){
    System.out.println(x);
    return sc.nextLong();
  }
}
class D extends C{
  static String g=sc.next();
  float h=sc.nextFloat();
  static float m4(int x){
     System.out.println(x);
     return sc.nextFloat();
  }
  public static void main(String []args){
   System.out.println(a+" "+c+" "+d+" "+g);
   System.out.println(m2(sc.next()));
   System.out.println(m4(sc.nextInt()));
   D obj=new D();
   System.out.println(obj.b+" "+obj.e+" "+obj.f+" "+obj.h);
   System.out.println(obj.m1(sc.nextInt()));
   System.out.println(obj.m3(sc.nextInt()));
  }
}