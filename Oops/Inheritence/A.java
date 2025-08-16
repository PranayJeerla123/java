import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   static int id=sc.nextInt();
   static String name=sc.next();
   static String designation=sc.next();
}
class B extends A{
   void display(){
     System.out.print("id"+id);
     System.out.print("name"+name);
  }
  
  public static void main(String []args){
     new B().display();
   }
}