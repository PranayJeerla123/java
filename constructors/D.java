import java.util.*;
class D{
  static Scanner sc=new Scanner(System.in);
  D(){
    System.out.println("Default constructor");
  }
  D(int a){
    System.out.println(a);
    D obj1=new D();
  }
  D(String a,float b){
   System.out.println(a+" "+b);
   D obj2=new D(sc.nextInt());
  }
  public static void main(String []args){
    new D(sc.next(),sc.nextFloat());
  }
}