import java.util.*;
interface I1{
  static Scanner sc=new Scanner(System.in);
  default int m1(String a){
     System.out.println(a);
     return sc.nextInt();
  }
  float m2(int a);
}
interface I2{
  default String m3(int a){
     System.out.println(a);
     return I1.sc.next();
  }
  boolean m4(float a);
}
interface I3{
  default float m5(String a){
     System.out.println(a);
     return I1.sc.nextFloat();
  }
  void m6(float a);
}
abstract class P{
  P(short a,boolean b){
    System.out.println(a+" "+b);
  }
  String m7(boolean a){
     System.out.println(a);
     return I1.sc.next();
  }
  abstract int m8(float a);
}
class Q extends P implements I1,I2,I3{
   Q(){
     super(I1.sc.nextShort(),I1.sc.nextBoolean());
   }
   public float m2(int a){
     System.out.println(a);
     return I1.sc.nextFloat();
   }
   public boolean m4(float a){
     System.out.println(a);
     return I1.sc.nextBoolean();
   }
   public void m6(float a){
     System.out.println(a);
   }
   int m8(float a){
     System.out.println(a);
     return I1.sc.nextInt();
   }
}
class Test1{
  public static void main(String []args){
    Q obj=new Q();
    System.out.println(obj.m1(I1.sc.next()));
    System.out.println(obj.m2(I1.sc.nextInt()));
    System.out.println(obj.m3(I1.sc.nextInt()));
    System.out.println(obj.m4(I1.sc.nextFloat()));
    System.out.println(obj.m5(I1.sc.next()));
    obj.m6(I1.sc.nextFloat());
    System.out.println(obj.m7(I1.sc.nextBoolean()));
    System.out.println(obj.m8(I1.sc.nextFloat()));
  }
}
