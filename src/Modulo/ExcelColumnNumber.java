package Modulo;

public class ExcelColumnNumber {
    public static int solve(String A) {
        int sum=0;

        int pow=1;
     for(int i=A.length()-1;i>=0;i--){

         int a=A.charAt(i)-'@';


        sum=sum+a*pow;
        pow=pow*26;

     }
        return sum;
    }

    public static void main(String[] args) {


        int a= solve("ABCD");
        System.out.println(a);

    }
}
