package Modulo;

public class ABModulo {
    public static  void solve(int a,int b) {
        int gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % 1 == 0 && b % i == 0) {
                gcd = i;

            }
        }
if(a%gcd==0 && b%gcd==0){
    System.out.println(gcd);
}

    }
    public static void main(String[] args) {


        solve(5,10);

    }
}
