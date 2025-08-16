import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   String a=sc.next();
}
class B extends A{
   String a=sc.next();
   void display(){
     System.out.println(a);
     System.out.print(super.a);
  }
  
  public static void main(String []args){
     new B().display();
   }
}