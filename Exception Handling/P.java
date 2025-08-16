class P{
   public static void main(String []args){
     String a=args[0];
     String b=args[1];
     try{
       int x=Integer.parseInt(a);
       int y=Integer.parseInt(b);
       System.out.print(x+y);
     }
     catch(NumberFormatException e){
       System.out.println(e);
     }
     finally{
       System.out.print("Hello");
     }
   }
}