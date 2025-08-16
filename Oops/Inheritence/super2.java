import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   String m1(int a){
     System.out.println(a);
     return sc.next();
   }
}
class B extends A{
   String m1(int a){
     System.out.println(a);
     System.out.println(super.m1(sc.nextInt()));
     return sc.next();
   }
}
class C extends B{
   String m1(int a){
     System.out.println(a);
     System.out.println(super.m1(sc.nextInt()));
     return sc.next();
   }
   public static void main(String []args){
     System.out.println(new C().m1(sc.nextInt()));
   }
}