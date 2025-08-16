import java.util.*;
class B{
  B(String s){
   System.out.print(s);
  }
  public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   B obj =new B(sc.next());
  }
}