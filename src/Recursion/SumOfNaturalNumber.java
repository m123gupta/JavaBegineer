package Recursion;

public class SumOfNaturalNumber {
    public static  int sumOf(int n){
        if(n==0){
            return 0;
        }
        int ans= n+sumOf(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sumOf(10));
    }
}
