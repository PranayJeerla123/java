import java.util.*;
@FunctionalInterface 
interface I{
  static Scanner sc=new Scanner(System.in);
  String m1(int a);
}
class Le{
  public static void main(String []rgs){
    I obj =(a)->{
      System.out.println(a);
      return I.sc.next();
    };
    System.out.println(obj.m1(I.sc.nextInt()));
    
  }
}