import java.util.*;
class L implements Runnable{
	public void run(){
             Thread t=Thread.currentThread();
	     if(t.getName().equals("t1")){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	     }
	     else{
		for(int i=11;i<=20;i++){
			System.out.println(i);
		}
	     }
	}
	public static void main(String []args){
		L obj1=new L();
		L obj2=new L();
		Thread t1=new Thread(obj1,"t1");
		Thread t2=new Thread(obj2,"t2");
		t1.start();
		t2.start();
	}
}