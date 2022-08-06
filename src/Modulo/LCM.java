package Modulo;

public class LCM {
    public static void solve(int A,int B){
        int gcd=0;
        int lcm=0;
        for(int i=1;i<=A && i<=B;i++){
            if(A%i==0 && B%i==0 ){
                gcd=i;
            }
        }
        lcm=(A*B)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
    public static void main(String[] args) {
        int A=4,B=6;
        solve(A,B);
    }
}
