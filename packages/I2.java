package pk1;
public interface I2{
   float m3(int a);
   default String m4(boolean a){
     System.out.println(a);
     return I1.sc.next();
   }
}