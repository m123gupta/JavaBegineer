package BitWiseOperator;

import java.util.Scanner;

public class BinaryToDeciamlConversion {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        long a= sc.nextLong();
        long ans=0;
        int p=1;
        while(a>0){
            long ld=a%10;
            ans=ans+p*ld;
            p=2*p;
            a=a/10;
        }
        System.out.println(ans);


    }
}
