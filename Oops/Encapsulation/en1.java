import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   private int id;
   private String username;
   private String password;
   A(int id,String username,String password){
     this.id=id;
     this.username=username;
     this.password=password;
   } 
   int getid(){
     return id;
   }
   String getusername(){
     return username;
   }
   String getpassword(){
     return password;
   }
}
class B{
  public static void main(String []args){
    A obj=new A(A.sc.nextInt(),A.sc.next(),A.sc.next());
    System.out.println("id -> "+obj.getid());
    System.out.println("username -> "+obj.getusername());
    System.out.println("password -> "+obj.getpassword());
  }
}