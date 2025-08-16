import java.util.*;
class B{
   static Scanner sc=new Scanner(System.in);
   String a=sc.next();
   B(){
     System.out.println("Default Constructor");
   }
   B(String a){
     this();
     System.out.println(a);
   }
   void m1(String a){
      System.out.println(a);
      System.out.println(this.a);
   }
}
class C extends B{
  int a=sc.nextInt();
  C(){
    super(sc.next());
  }
  void m2(){
     System.out.println(a);
     System.out.println(super.a);
  }
  public static void main(String []args){
    C obj=new C();
    obj.m1(sc.next());
    obj.m2();
  }
}