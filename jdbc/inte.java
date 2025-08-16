import java.util.*;
class A{
   void display(){
     System.out.print("method from class A");
     
   }
}
class B extends A{
   void display(){
     System.out.print("method from class B");
     
   }
  
  public static void main(String []args){
     A obj=new B();
     obj.display();
   }
}