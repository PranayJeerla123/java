import java.util.Scanner;
class J{
 static void even(int n){
     if(n%2==0)
     System.out.print("even");
     else
     System.out.print("odd");
 }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    even(a);
  }
}