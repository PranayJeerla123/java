class C1{
   static int a=10;
}
class C2 extends C1{
  static int b=20;
}
class C3 extends C2{
   static int c=30;
}
class C4 extends C3{
    static int d=40;
   public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+d);
  }
}
class C5 extends C3{
     static int e=50;
    public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+e);
  }
}
class C6 extends C3{
     static int f=60;
 public static void main(String []args){
     System.out.print(a+" "+b+" "+c+" "+f);
  }
}