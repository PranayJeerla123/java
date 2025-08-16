import java.util.*;
class A{
   public static void main(String []args){
      
      try{
        System.out.print(11/0);
      }
      catch(ArithmeticException e){
         System.out.print(e);
      }
   }
}