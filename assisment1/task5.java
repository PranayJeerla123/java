import java.util.*;
class Task5{
  public static void main(String []arg){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter any number ");
   int a=sc.nextInt();
   if(a>=90 && a<=100)
     System.out.print("super smart");
   else if(a>=80 && a<=90)
     System.out.print("Smart");
   else if(a>=70 && a<=80)
     System.out.print("smart enough");
   else if(a<=60 && a>=70)
     System.out.print("just smart");
   else if(a>=35 && a<=60)
     System.out.print("no smart");
   else if(a>=0 && a<=35)
     System.out.print("dump");
   else
     System.out.print("Invalid input");

  }
 
}