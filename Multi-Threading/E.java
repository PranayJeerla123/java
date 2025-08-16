import java.util.*;
class MyThread extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("t1")){
    	  for(int i=1;i<=10;i++){
		System.out.println(i);
          }
        }
        else if(name.equals("t2")){
    	  for(int i=11;i<=20;i++){
		System.out.println(i);
          }
        }
        else if(name.equals("t3")){
    	  for(int i=21;i<=30;i++){
		System.out.println(i);
          }
        }
    }
}
class E{
     public static void main(String []args){
          MyThread t1=new MyThread();
           MyThread t2=new MyThread();
           MyThread t3=new MyThread();
           t1.setName("t1");
           t2.setName("t2");
           t3.setName("t3");
          t1.start();
           t2.start();
           t3.start();
          
     }
}