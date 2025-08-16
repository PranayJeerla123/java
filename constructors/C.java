import java.util.*;
class C{
  C(){
   System.out.println("Default Constructor");
  }
  C(String s){
   System.out.println(s);
  }
  C(String s,int a){
   System.out.println(s+" "+a);
  }
  C(String s,int a,float b){ 
   System.out.println(s+" "+a+" "+b);
  }
  public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   
   C obj1=new C();
   String s=sc.next();
   int a=sc.nextInt();
   float b=sc.nextFloat();
   C obj2 =new C(s);
   C obj3=new C(s,a);
   C obj4=new C(s,a,b);
  }
}