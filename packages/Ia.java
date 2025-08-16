package a1;
public interface Ia{
  String m2(float a);
  default int m3(boolean a){
    System.out.println(a);
    return P.sc.nextInt();
  }
}