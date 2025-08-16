import java.util.*;
class A{
   static Scanner sc=new Scanner(System.in);
   String m1(int a){
      System.out.println(a);
      Thread t1=Thread.currentThread();
      System.out.println(t1.getName());
      return sc.next();
   }
   float m2(boolean a){
      System.out.println(a);
      Thread t1=Thread.currentThread();
      System.out.println(t1.getName());
      return sc.nextFloat();
   }
}
class MyThread extends Thread{
    public void run(){
      A obj=new A();
      System.out.println(obj.m1(A.sc.nextInt()));
      System.out.println(obj.m2(A.sc.nextBoolean()));
    }
}
class F{
    public static void main(String []args){
       MyThread t1=new MyThread();
       t1.start();
    }
}