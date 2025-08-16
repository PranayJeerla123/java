import java.util.*;
interface I{
  static Scanner sc=new Scanner(System.in);
  default int m1(String a){
    System.out.println(a);
    return sc.nextInt();
  }
  float m2(int a);
}
abstract class A implements I{
  A(boolean a){
    System.out.println(a);
  }
  String m3(int a){
    System.out.println(a);
    return sc.next();
  }
 
  abstract boolean m4(float a);
}
class Bb extends A{
  Bb(){
   super(sc.nextBoolean());
  }
   public float m2(int a){
     System.out.println(a);
     return sc.nextFloat();
  }
  boolean m4(float a){
    System.out.println(a);
    return sc.nextBoolean();
  }
  public static void main(String []args){

    Bb obj =new Bb();
    System.out.println(obj.m1(sc.next()));
    System.out.println(obj.m2(sc.nextInt()));
    System.out.println(obj.m3(sc.nextInt()));
    System.out.println(obj.m4(sc.nextFloat()));
  
  }
}