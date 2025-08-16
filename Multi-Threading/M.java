import java.util.*;
class M{
	public static void main(String []args){
		Runnable r=new Runnable(){
			public void run(){
                        	System.out.println("run");
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(new Runnable(){
			public void run(){
                        	System.out.println("run2");
			}
		});
                Runnable r2=()->{
			System.out.println("run3");
		};
		Thread t3=new Thread(r2);
		Thread t4=new Thread(()->{
			System.out.println("run4");
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}