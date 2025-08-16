import java.util.*;
abstract class Bb{
  static Scanner sc=new Scanner(System.in);
  static int m1(String a){
    System.out.println(a);
    return sc.nextInt();
  }
  public static void main(String []ar){
    System.out.println(m1(sc.next()));
  }
}