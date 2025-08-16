package two;
import one.*;
public class Bb{
  public static void main(String []args){
    Aa obj=new Aa(Aa.sc.next());
    System.out.println(obj.a);
    System.out.println(obj.m1(Aa.sc.nextBoolean()));
  }
}