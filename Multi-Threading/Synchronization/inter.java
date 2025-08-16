import java.util.*;
class Bank2{
	float balance=10000;
	synchronized void deposite(float amount){
		balance+=amount;
		System.out.println("Deposite Successfully");
		try{
			notify();
		}
		catch(Exception e){
		}

	}
	synchronized void withdraw(float amount){
		if(amount > balance){
			System.out.println("Withdraw > balance");
			System.out.println(" Waiting for Deposite");
			try{
				wait();
			}
			catch(Exception e){
			}
		}
		balance -=amount;
		System.out.println("withdraw is Successfully");
	}
}
class Main{
	public static void main(String []args) throws Exception{
		Bank2 b=new Bank2();
		
		new Thread(()->{
			b.withdraw(15000);
				}).start();
		Thread.sleep(3000);
		new Thread(()->{
			b.deposite(10000);
				}).start();
		
	}
}