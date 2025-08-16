import java.util.*;
class E{
  static Scanner sc=new Scanner(System.in);
  String a;
  float b;
  E(String a,float b){
   System.out.print(this.a+" "+this.b);
   this.a=a;
   this.b=b;
  }
  public static void main(String []args){
    E obj=new E(sc.next(),sc.nextFloat());
    System.out.print(obj.a+" "+obj.b);
  }
}