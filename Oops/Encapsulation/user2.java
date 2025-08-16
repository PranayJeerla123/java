import java.util.*;
class Bank{
   static Scanner sc=new Scanner(System.in);
   private String username=sc.next();
   private String password=sc.next();
   void setusername(String username){
     this.username=username;
   }
   void setpassword(String password){
     this.password=password;
   }
   String getusername(){
     return username;
   }
   String getpassword(){
     return password;
   }
}
class User{
  public static void main(String []args){
    Bank obj=new Bank();
    obj.setusername(Bank.sc.next());
    obj.setpassword(Bank.sc.next());
    System.out.println("username  ->"+obj.getusername());
    System.out.print("password  ->"+obj.getpassword());
  }
}
