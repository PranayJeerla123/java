class P extends Thread{
	public void run(){
		
	}
	public static void main(String []args){
		P t1=new P();
		t1.setDaemon(true);
		System.out.print(t1.isDaemon());
	}
}