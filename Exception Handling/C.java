import java.util.*;
class C{
   static Scanner sc=new Scanner(System.in);
   static String s;
   public static void main(String []args){
     try{
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(a/b);
       String c=sc.next();
       int x=Integer.parseInt(c);
       System.out.println(a+b+x);
       System.out.println(s.length());
       int d[]=new int[-1];
     }
     catch(ArithmeticException e){
       System.out.println(e);
     }
     catch(NumberFormatException e){
       System.out.println(e);
     }
     catch(InputMismatchException e){
       System.out.println(e);
     }
     catch(Exception e){
       System.out.println(e);
     }
     finally{
       System.out.println("hello");
     }
   }
}