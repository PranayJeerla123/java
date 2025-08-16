import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   int a;
   A(int a){
    this.a=a;
   }
}
class B extends A{
   int b;
   B(int a,int b){
     super(a);
     this.b=b;
   }
}
class C extends B{
   int c;
   C(int a,int b,int c){
      super(a,b);
      this.c=c;
   }
   public static void main(String []args){
     C obj=new C(10,20,30);
     System.out.println(obj.a+" "+obj.b+" "+obj.c);
   }
}