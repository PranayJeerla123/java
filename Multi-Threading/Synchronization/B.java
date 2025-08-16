class A{
	static int i;
	synchronized static void increment(){
		i++;
		System.out.print(i+" ");
		if(i==100){
			System.out.print("COMPLETED ");
		}
	}
}
class X1 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			A.increment();
		}
	}
}
class X2 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			A.increment();
		}
	}
	public static void main(String []args) throws Exception{
		A obj=new A();
		X1 t1=new X1();
		X2 t2=new X2();
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		System.out.print(A.i);
	}
}