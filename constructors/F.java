import java.util.*;
class F{
  static Scanner sc=new Scanner(System.in);
  String a;
  F(String b){
   a=b;
   System.out.print(a);
  }
  boolean m1(int x){
   System.out.println(x);
   return sc.nextBoolean();
  }
  public static void main(String []args){
    F obj=new F(sc.next());
    System.out.print(obj.m1(sc.nextInt()));
  }
}