import java.util.*;
class Bank{
   static Scanner sc=new Scanner(System.in);
   private int atm=1234;
   void set(int atm){
     this.atm=atm;
   }
   int get(){
     return atm;
   }
}
class User{
  public static void main(String []args){
    Bank obj=new Bank();
    obj.set(Bank.sc.nextInt());
    System.out.print(obj.get());
  }
}
