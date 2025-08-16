import java.util.*;
class A{
   private String a;
   private int b;
   A(String a,int b){
     this.a=a;
     this.b=b;
     System.out.println(a+" "+b);
   }
   void seta(String a){
     this.a=a;
   }
   void setb(int b){
     this.b=b;
   }
   String geta(){
     return a;
   }
   int getb(){
     return b;
   }
}
class User{
   public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     A obj=new A(sc.next(),sc.nextInt());
     obj.seta(sc.next());
     obj.setb(sc.nextInt());
     System.out.println(obj.geta());
     System.out.println(obj.getb());
   }
}