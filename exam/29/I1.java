package p1;
import java.util.*;
public interface I1{
   static Scanner sc=new Scanner(System.in);
   String m1(int a);
   default float m2(boolean a){
     System.out.println(a);
     return sc.nextFloat();
   }
}