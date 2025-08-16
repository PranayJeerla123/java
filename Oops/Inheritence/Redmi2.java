import java.util.*;
class Redmi{
   static Scanner sc=new Scanner(System.in);
   static String name=sc.next();
   static String ram=sc.next();
   static String rom=sc.next();
   static String battery=sc.next();
   static int price=sc.nextInt();
}
class Wholesale extends Redmi{
  int price1=price+sc.nextInt();
}
class Retail extends Wholesale{
   int price2=price1+sc.nextInt();
}
class Customer extends Retail{
  void Display(){
   System.out.println(name);
   System.out.println(ram);
   System.out.println(rom);
   System.out.println(battery);
   System.out.println(price2);
  }
  public static void main(String []args){
    Customer obj=new Customer();
    obj.Display();
   }
}