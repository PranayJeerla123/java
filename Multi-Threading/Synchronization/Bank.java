class Bank{
	static int bal=0;
	synchronized static void Deposite(){
		bal+=100;
	}
}
class T extends Thread{
	public void run(){
		Bank.Deposite();
	}
	public static void main(String []args) throws Exception{
		T t1=new T();t1.start();t1.sleep(1000);
		T t2=new T();t2.start();t2.sleep(1000);
		T t3=new T();t3.start();t3.sleep(1000);
		T t4=new T();t4.start();t4.sleep(1000);
		T t5=new T();t5.start();
		t5.join();
		System.out.print(Bank.bal);
	}
}