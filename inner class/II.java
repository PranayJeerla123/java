import java.util.*;
interface I1{
  static Scanner sc=new Scanner(System.in);
  String m1(int a);
  default float m2(boolean a){
    System.out.println(a);
    return sc.nextFloat();
  }
  interface I2{
    int m3(String a);
    static boolean m4(float a){
       System.out.println(a);
       return sc.nextBoolean();
    }
    class A{
       long m5(float a){
          System.out.println(a);
          return sc.nextLong();
       }
    }
  }
  abstract class Bb{
    Bb(short a){
      System.out.println(a);
    }
    abstract String m6(float a);
    boolean m7(int a){
        System.out.println(a);
        return sc.nextBoolean();
    } 
  }
}
class Test3 extends I1.Bb implements I1,I1.I2{
  Test3(){
    super(sc.nextShort());
  }
  public String m1(int a){
     System.out.println(a);
     return sc.next();
  }
  public int m3(String a){
     System.out.println(a);
     return sc.nextInt();
  }
  String m6(float a){
     System.out.println(a);
    return sc.next();
  }
  public static void main(String []args){
    Test3 obj1=new Test3();
    System.out.println(obj1.m1(sc.nextInt()));
    System.out.println(obj1.m2(sc.nextBoolean()));
    System.out.println(obj1.m3(sc.next()));
   System.out.println(I1.I2.m4(sc.nextFloat()));
   I1.I2.A obj2 = new I1.I2.A();
   System.out.println(obj2.m5(sc.nextFloat()));
   System.out.println(obj1.m6(sc.nextFloat()));
   System.out.println(obj1.m7(sc.nextInt()));
  }
}