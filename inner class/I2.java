import java.util.*;
abstract class Ab{
  static Scanner sc=new Scanner(System.in);
  abstract float m1(String a);
  int m2(boolean a){
    System.out.println(a);
    return sc.nextInt();
  }
}
interface I2{
   
   String m3(int a);
   default boolean m4(float a){
     System.out.println(a);
     return Ab.sc.nextBoolean();
   }
   public static void main(String []args){
     Ab obj1 = new Ab(){
       float m1(String a){
          System.out.println(a);
         return Ab.sc.nextFloat();
       }
     };
     I2 obj2 =new I2(){
       public String m3(int a){
         System.out.println(a);
         return Ab.sc.next();
       }
     };
     System.out.println(obj1.m1(Ab.sc.next()));
     System.out.println(obj1.m2(Ab.sc.nextBoolean()));
     System.out.println(obj2.m3(Ab.sc.nextInt()));
     System.out.println(obj2.m4(Ab.sc.nextFloat()));
   }
}