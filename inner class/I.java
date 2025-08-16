import java.util.*;
interface I{
   static Scanner sc=new Scanner(System.in);
   String m1(int a);
   public static void main(String []args){
     I obj =new I(){
       public String m1(int a){
         System.out.println(a);
         return sc.next();
       }
     };
     System.out.println(obj.m1(sc.nextInt()));
   }
}