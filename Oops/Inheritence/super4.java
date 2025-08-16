import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   A(){
      System.out.println("A constructor");
   }
}
class B extends A{
   B(int a){
     super();
     System.out.println(a);
   }
}
class C extends B{
   C(String a,float b){
      super(sc.nextInt());
      System.out.println(a+" "+b);
   }
}
class D extends C{
   D(){
    super(sc.next(),sc.nextFloat());
    System.out.println("D constructor");
   }
}
class E extends D{
   E(boolean a,int b,String c){
      super();
      System.out.println(a+" "+b+" "+c);
   }
   public static void main(String []args){
     new E(sc.nextBoolean(),sc.nextInt(),sc.next());
   }
}
