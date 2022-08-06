package Recursion;

public class PowerOfNumber {
    public static  int powerOfNumber(int a,int b){
        if(b==0){
            return 1;
        }
        int ans= a* powerOfNumber(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerOfNumber(5,2));
    }
}
