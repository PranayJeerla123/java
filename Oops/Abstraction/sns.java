import java.util.*;
class P{
  static Scanner sc=new Scanner(System.in);
  static{
     String a=sc.next();
     int b=sc.nextInt();
     System.out.println(a+" "+b);
  }
  {
  float c=sc.nextFloat();
  boolean d=sc.nextBoolean();
  System.out.println(c+" "+d);
  } 
  P(){
    System.out.println("Default Constructor");
  }
  P(float a){
    System.out.println(a);
  }
  static int m1(float a){
   System.out.println(a);
   return sc.nextInt();
  }
  boolean m2(String a){
    System.out.println(a);
    return sc.nextBoolean();
  }
  public static void main(String []args){
   P obj1=new P(sc.nextFloat());
   
   System.out.println(m1(sc.nextFloat()));
   System.out.println(new P().m2(sc.next()));
  }
}