package test;
import a1.*;
import a1.a2.*;
public class Test extends Q implements Ia,R,a1.a2.a3.S,a1.a2.a3.T{
  public Test(){
   super(P.sc.nextInt());
  }
  public String m2(float a){
   System.out.println(a);
   return P.sc.next();
  }
  public boolean m4(long a){
    System.out.println(a);
    return P.sc.nextBoolean();
  }
  public int m6(boolean a){
    System.out.println(a);;
    return P.sc.nextInt();
  } 
  public String m7(float a){
    System.out.println(a);
    return P.sc.next();
  }
  public float m8(String a){
    System.out.println(a);
    return P.sc.nextFloat();
  }
   public short m9(boolean a){
    System.out.println(a);;
    return P.sc.nextShort();
  } 
  public static void main(String []args){
    P obj1=new P(P.sc.next());
    System.out.println(obj1.m1(P.sc.nextInt()));
    Test obj2=new Test();
    System.out.println(obj2.m2(P.sc.nextFloat()));
    System.out.println(obj2.m3(P.sc.nextBoolean()));
    System.out.println(obj2.m4(P.sc.nextLong()));
    System.out.println(obj2.m5(P.sc.nextInt()));
    System.out.println(obj2.m6(P.sc.nextBoolean()));
    System.out.println(obj2.m7(P.sc.nextFloat()));
    System.out.println(obj2.m8(P.sc.next()));
    System.out.println(obj2.m9(P.sc.nextBoolean()));
    System.out.println(a1.a2.a3.T.m10(P.sc.nextInt()));
    System.out.println(obj2.m11(P.sc.nextBoolean()));
    a1.a2.a3.U obj3 = new a1.a2.a3.U(P.sc.nextBoolean());
    obj3.m12(P.sc.next());
  }
}