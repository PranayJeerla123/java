import java.util.*;
class A{

      static Scanner sc=new Scanner(System.in);
      float m1(String a){
         System.out.println(a);
         return sc.nextFloat();
      }
}
class K extends A implements Runnable{
     public void run(){
	System.out.print("run");
     }
     public static void main(String []args){
	K obj = new K();
        Thread t1=new Thread(obj);
 	t1.start();
	System.out.println(obj.m1(sc.next()));
     }
}