import java.util.*;
@FunctionalInterface 
interface I{
  static Scanner sc=new Scanner(System.in);
  String m1(int a);
  default float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
}
class Z implements I{
  public String m1(int a){
    System.out.println(a);
    return sc.next();
  }
  public static void main(String []rgs){
    Z obj1=new Z();
    System.out.println(obj1.m1(sc.nextInt()));
    System.out.println(obj1.m2(sc.nextBoolean()));
    I obj2=new I(){
      public String m1(int a){
      System.out.println(a);
        return sc.next();
      }
    };
    System.out.println(obj2.m1(sc.nextInt()));
    System.out.println(obj2.m2(sc.nextBoolean()));
  }
}