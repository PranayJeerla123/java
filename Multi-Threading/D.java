import java.util.*;
class MyThread extends Thread{
    public void run(){
    	for(int i=1;i<=10;i++){
		System.out.println(i);
        }
    }
}
class D{
     public static void main(String []args){
          MyThread t1=new MyThread();
          t1.start();
          t1.run();
     }
}