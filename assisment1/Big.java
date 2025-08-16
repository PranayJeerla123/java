import java.util.*;
class Big{
  public static void main(String []arg){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter 3 nunmbers ");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int big=a;
   if(b>big) 
    big=b;
   if(c>big)
    big=c;
   System.out.print("The biggest number is "+big);

  }
 
}