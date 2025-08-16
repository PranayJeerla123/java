import java.util.*;
class A{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());
		t1.setName(sc.next());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setName(sc.next());
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setName(sc.next());
		t3.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());

	}
}