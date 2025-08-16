package p2;
import p1.*;
public class C extends A{
     public static void main(String []args){
       System.out.println("outside package");
       C obj = new C();
       System.out.println(obj.c);
       System.out.println(obj.d);
       new B().m2();
  }
}