import java.util.*;
interface I{
  static Scanner sc=new Scanner(System.in);
  String m1(int a);
  float m2(boolean a);
}
class A implements I{
  public String m1(int a){
    System.out.println(a);
    return sc.next();
  }
  public float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
  int m3(String a){
      System.out.println(a);
    return sc.nextInt();
  }
  public static void main(String []args){
    I obj=new A();
    System.out.println(obj.m1(sc.nextInt()));
    System.out.println(obj.m2(sc.nextBoolean()));
   A obj2=(A)obj;
    System.out.println(obj2.m3(sc.next()));
}
}
