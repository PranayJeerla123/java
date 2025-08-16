import java.util.*;
abstract class Z{
  static Scanner sc=new Scanner(System.in);
  abstract int m1(String a);
  abstract float m2(boolean a);
}
class A extends Z{
  int m1(String a){
    System.out.println(a);
    return sc.nextInt();
  }
  float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
}
class B extends Z{
   int m1(String a){
    System.out.println(a);
    return sc.nextInt();
  }
  float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
}
class C extends Z{
   int m1(String a){
    System.out.println(a);
    return sc.nextInt();
  }
  float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
}
class Test{
   void display(Z obj){
     System.out.println(obj.m1(Z.sc.next()));
     System.out.println(obj.m2(Z.sc.nextBoolean()));
   }
   public static void main(String []args){
     int n=Z.sc.nextInt();
     Test obj=new Test();
     if(n==1){
       Z obj1=new A();
       obj.display(obj1);
     }
     else if(n==2){
       Z obj2=new B();
       obj.display(obj2);
     }
     else if(n==3){
       Z obj3=new C();
       obj.display(obj3);
     }
   }
}