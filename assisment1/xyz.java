import java.util.*;
class A{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    while(a<b){
      System.out.printf("%.1f ",a);
      a=a+0.2f;
    }
  }
}