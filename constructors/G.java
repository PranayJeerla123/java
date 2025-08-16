import java.util.*;
class G{
  static Scanner sc=new Scanner(System.in);
  static String a;
  static float b;
  int c;
  boolean d;
  G(){
    System.out.print("Default Constructor");
  }
  G(String p){
   a=p;
   System.out.print(p);
  }
  G(float q,int r){
   b=q;
   c=r;
   System.out.println(q+" "+r);
  }
  static String m1(int s){
    System.out.print(s);
    return sc.next();
  }
  boolean m2(float x){
   System.out.println(x);
   return sc.nextBoolean();
  }
  public static void main(String []args){
    G obj1=new G();
    G obj2=new G(sc.next());
    G obj3=new G(sc.nextFloat(),sc.nextInt());
    obj3.d=sc.nextBoolean();
    System.out.println(a+" "+b+" "+obj3.c+" "+obj3.d);
    System.out.println(m1(sc.nextInt()));
    System.out.println(obj3.m2(sc.nextFloat()));
    
  }
}