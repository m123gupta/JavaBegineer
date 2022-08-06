package Modulo;

public class MODString {
    public static void solve(String A, int B) {
        long sum=0;

        int p=1;

        for(int i=A.length()-1;i>=0;i--){
            int a = A.charAt(i) - '0';

            sum=(sum+(a*p)%B)%B;
            p=(p*10)%B;


        }
        System.out.println(sum);
    }

    public static void main(String[] args) {


        solve("143", 2);

    }
}
