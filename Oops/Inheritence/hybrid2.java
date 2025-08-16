import java.util.*;
class C1{
   static Scanner sc=new Scanner(System.in);
   static int a=sc.nextInt();
   String aa=sc.nextInt();
   void d1(){
     System.out.println(a+" "+aa);
   }
   
}
class C2 extends C1{
  static String b=sc.nextInt();
  int bb=sc.nextInt();
  void d2(){
      System.out.println(b+" "+bb);
  }
  
}
class C3 extends C2{
   static int c=30;
    void d3(){
      System.out.println(a+" "+aa+" "+b+" "+bb);
  }
}
class C4 extends C3{
    static int d=40;
   public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+d);
     new C4().d1();
  }
}
class C5 extends C3{
     static int e=50;
    public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+e);
     new C5().d2();
  }
}
class C6 extends C3{
     static int f=60;
 public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+f);
     new C6().d3();
  }
}