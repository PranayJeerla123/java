package a1.a2.a3;
public interface T{
  static float m10(int a){
    System.out.println(a);
    return a1.P.sc.nextFloat();
  }
  default long m11(boolean a){
    System.out.println(a);
     return a1.P.sc.nextLong();
  }
}