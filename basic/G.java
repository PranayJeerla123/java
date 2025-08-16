class G{
  static void m1(long a){
   System.out.println(a);
  }
  void m2(float x){ 
   System.out.print(x);
  }
  public static void main(String []args){
   G obj=new G();
   m1(1234567890123456789l);
   obj.m2(3.14f);
  }
}