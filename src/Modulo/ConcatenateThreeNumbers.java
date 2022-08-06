package Modulo;

public class ConcatenateThreeNumbers {
    public static String min(int A,int B,int C){
        String s="";
        if(A<B || A<C){
            int temp=A;
            A=B;
            B=A;
        }
        if (B<A || B<C) {
            int temp=B;
            B=A;
            A=B;
        }
        if(C>A && C>B) {
            int temp=B;
            B=A;
            A=B;
        }
        return s;

    }
    public static void solve(int A, int B,int C) {
       int sum=0;

        int min = Math.min(A, (Math.min(B, C)));
        if(min==A){
             sum=A*100+Math.min(B,C);
             sum=sum*100+Math.max(B,C);
        }
        if(min==B){
            sum=B*100+Math.min(A,C);
            sum=sum*100+Math.max(A,C);
        }
        if(min==C){
            sum=C*100+Math.min(A,B);
            sum=sum*100+Math.max(A,B);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {


        solve(10, 20,30);

    }

}
