package pk3;
import pk1.pk2.Ab;
public class Vk extends Ab implements pk1.I1,pk1.I2{
   Vk(){
     super(sc.nextLong());
   }
   public String m1(int a){
      System.out.println(a);
      return sc.next();
   }
   public float m3(int a){
      System.out.println(a);
      return sc.nextFloat();
   }
   public boolean m5(float a){
      System.out.println(a);
      return sc.nextBoolean();
   }
   public static void main(String []args){
     Vk obj = new Vk();
     System.out.println(obj.m1(sc.nextInt()));
     System.out.println(obj.m2(sc.nextBoolean()));
     System.out.println(obj.m3(sc.nextInt()));
     System.out.println(obj.m4(sc.nextBoolean()));
     System.out.println(obj.m5(sc.nextFloat()));
     System.out.println(obj.m6(sc.next()));
   }
}