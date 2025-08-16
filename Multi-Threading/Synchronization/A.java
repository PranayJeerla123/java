class A{
	int i;
	synchronized void increment(){
		i++;
		System.out.print(i+" ");
	}
}
class T1 extends Thread{
	static A obj;
	T1(A obj){
		this.obj=obj;
	}
	public void run(){
		for(int i=1;i<=100;i++){
			obj.increment();
		}
	}
}
class T2 extends Thread{
	static A obj;
	T2(A obj){
		this.obj=obj;
	}
	public void run(){
		for(int i=1;i<=100;i++){
			obj.increment();
		}
	}
	public static void main(String []args) throws Exception{
		A obj=new A();
		T1 t1=new T1(obj);
		T2 t2=new T2(obj);
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		System.out.print(obj.i);
	}
}