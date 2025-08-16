import java.util.*;
class MyThread extends Thread{
    public void run(){
        try{
    	for(int i=1;i<=10;i++){
		System.out.println(i);
                Thread t=Thread.currentThread();
                t.sleep(3000);
        }
       }
       catch(InterruptedException e){
           System.out.println(e);
       }
    }
}
class D{
     public static void main(String []args) {
          MyThread t1=new MyThread();
          t1.start();
     }
}