import java.util.*;
class Task4{
  public static void main(String []arg){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter any number ");
   int a=sc.nextInt();
   if(a>=100 && a<=1000){
     if(a%2==0){
       System.out.print(a%3);
      
     } 
    else{
       System.out.print(a%2);
    }
   
   }
   else{
    System.out.print("wrong number");
   }
   

  }
 
}