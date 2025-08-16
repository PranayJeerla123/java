import java.util.*;
class Redmi{
   static Scanner sc=new Scanner(System.in);
   static String name=sc.next();
   static String ram=sc.next();
   static String rom=sc.next();
   static String battery=sc.next();
   static int p=sc.nextInt();
}
class Wholesale extends Redmi{
   void increment1(){
   p++;
  } 
}
class Retail extends Wholesale{
  void increment2(){
  p++;
  }
}
class Customer extends Retail{
  void Display(){
   System.out.println(name);
   System.out.println(ram);
   System.out.println(rom);
   System.out.println(battery);
   System.out.println(p);
  }
  public static void main(String []args){
    Customer obj=new Customer();
    obj.increment1();
    obj.increment2();
    obj.Display();
   }
}