import java.util.*;
class C{
   static Scanner sc=new Scanner(System.in);
   String m1(float a){  
      System.out.print(a);
      return sc.next();
   }
}
class D extends C{
    String m1(float a){  
      System.out.print(a);
      System.out.print(super.m1(sc.nextFloat()));
      return sc.next();
   }
   public static void main(String []args){
    D obj= new D();
    System.out.print(obj.m1(sc.nextFloat()));
   }
}
