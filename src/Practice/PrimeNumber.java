package Practice;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
         long Sum=0;
//        if(n!=1) {
             for (int i = 1; i < n; i++) {
                 if (n % i == 0) {
                     Sum = Sum + i;
                 }
             }
       // }
        if(Sum==n){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");

        }
    }
}
