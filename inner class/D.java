import java.util.*;
class D{
  static Scanner sc=new Scanner(System.in);
  String m1(int a){
    System.out.println(a);
    class E{
      E(float a,String b){
        System.out.println(a+" "+b);
      }
      boolean m2(float a){
        System.out.println(a);
        return sc.nextBoolean();
      }
    }
    E ee = new E(sc.nextFloat(),sc.next());
    System.out.println(ee.m2(sc.nextFloat()));
    return sc.next();
  }
  public static void main(String []args){
    D dd = new D();
    System.out.println(dd.m1(sc.nextInt()));
  }
}