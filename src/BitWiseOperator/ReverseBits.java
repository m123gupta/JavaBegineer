package BitWiseOperator;

public class ReverseBits {
    public static long addBinary(long A) {
         int power=00000000000000000000000000000000 ;
         long res=0;
         int p=1;
         while(A>0){
             long rem=A%2;
             A=A/2;
             p=p*2;
             res=res+rem;

         }
         return res;
     //   System.out.println(res);
    }
    public static void main(String[] args) {
        long A=3;
        long s= addBinary(A);
        System.out.println(s);
    }
}
