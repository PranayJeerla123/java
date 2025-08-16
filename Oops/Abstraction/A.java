import java.util.*;
abstract class A{
  abstract String m1(int a);
}
class B extends A{
  static Scanner sc=new Scanner(System.in);
  String m1(int a){
    System.out.println(a);
    return sc.next();
  }
  public static void main(String []args){
     B obj=new B();
     System.out.print(obj.m1(sc.nextInt()));
  }
}