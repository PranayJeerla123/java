import java.util.*;
class E{
   static Scanner sc=new Scanner(System.in);
   E(String a){
     System.out.println(a);
   }
   E(float a,int b){
     this(sc.next());
     System.out.println(a+" "+b);
   }
   int m1(String a){
      System.out.println(a);
      return sc.nextInt();
   }
   String m1(float a){  
      System.out.println(a);
      return sc.next();
   }
}
class F extends E{
   F(boolean a){
      super(sc.nextFloat(),sc.nextInt());
      System.out.println(a);
   }
   String m1(float a){
     System.out.println(a);
     System.out.println(super.m1(sc.nextFloat()));
     System.out.println(this.m1(sc.next()));
     return sc.next();
   }
   public static void main(String []args){
      F obj= new F(sc.nextBoolean());
      System.out.println(obj.m1(sc.nextFloat()));
   }
}
