import java.util.*;
class Task6{
  public static void main(String []arg){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter two numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.print("enter operator");
   char c=sc.next().charAt(0);
   switch(c){
   case '+':System.out.print(a+b);
          break;
   case '-':System.out.print(a-b);
          break;
   case '*':System.out.print(a*b);
          break;
   case '/':System.out.print(a/b);
          break;
   default: System.out.print("invalid input");
       
  }

  }
 
}