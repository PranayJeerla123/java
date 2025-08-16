import java.util.*;
class Aaaa{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        while(f==1){
            int c=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                 c++;
            }
            if(c==0){
                System.out.print("prime");
                n=sc.nextInt();
                
            }
            else{
                f=0;
                System.out.print("Not prime");
            }
        }
       
    }
}