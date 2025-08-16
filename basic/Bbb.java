class Bbb{
  static int x;
  static void m1(){
    x=10;
  }
  static void m2(){
    System.out.print(x);
  }
  public static void main(String []args){
    m1();
    m2();
  }
}