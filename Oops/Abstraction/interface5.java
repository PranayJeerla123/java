import java.util.*;
interface I{
  static Scanner sc=new Scanner(System.in);
  float m1(int a);
  String m2(boolean a);
}
class A implements I{
  public float m1(int a){
    System.out.println(a);
    return sc.nextFloat();
  }
  public String m2(boolean a){
    System.out.println(a);
    return sc.next();
  }
}
class B implements I{
  public float m1(int a){
    System.out.println(a);
    return sc.nextFloat();
  }
  public String m2(boolean a){
    System.out.println(a);
    return sc.next();
  }
}
class C implements I{
  public float m1(int a){
    System.out.println(a);
    return sc.nextFloat();
  }
  public String m2(boolean a){
    System.out.println(a);
    return sc.next();
  }
}
class Test2{
   void Display(I obj){
     System.out.println(obj.m1(I.sc.nextInt()));
      System.out.println(obj.m2(I.sc.nextBoolean()));
   }
   public static void main(String []args){
      System.out.print("Enter Class Name:");
      String s=I.sc.next();
      if(s.equals("A")){
       A obj=new A();
       new Test2().Display(obj);
      }
      else if(s=="B"){
        B obj=new B();
       new Test2().Display(obj);
      }
      else if(s=="C"){
        C obj=new C();
       new Test2().Display(obj);
      }

   }
}
