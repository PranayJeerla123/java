import java.util.*;
interface A{
  static Scanner sc=new Scanner(System.in);
  default void m1(String a){
    System.out.println(a);
  }
  float m2(int a);
}
class B implements A{
  public float m2(int a){
     System.out.println(a);
     return sc.nextFloat();
  }
  public static void main(String []args){

    B obj =new B();
    obj.m1(sc.next());
    System.out.println(obj.m2(sc.nextInt()));
  }
}