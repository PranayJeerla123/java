package p1;
public class B{
  public void m2(){
     System.out.println("within package");
     A obj = new A();
     System.out.println(obj.b);
     System.out.println(obj.c);
     System.out.println(obj.d);
     obj.m1();
  }
}