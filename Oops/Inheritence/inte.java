import java.util.*;
class A{
   void display(){
     System.out.println("method from class A");
     
   }
   void m1(){
	System.out.println("method m1");
   }
}
class B extends A{
   void display(){
     System.out.println("method from class B");
     
   }
  
  public static void main(String []args){
     A obj=new B();
     obj.display();
     obj.m1();
   }
}