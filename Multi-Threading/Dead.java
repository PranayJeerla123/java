class Dead extends Thread{
	static Thread t1;
	public void run(){
		System.out.println("child");
		try{
			t1.join();
		}
		catch(Exception e){}
		
	}
	public static void main(String []args) throws Exception{
		t1=Thread.currentThread();
		Dead d=new Dead();
		d.start();
		d.join();
		System.out.print("main");
	}
}