package Recursion;

public class MultiplyTwoNumber {
    public static  int multiplyOfTwoNumber(int a,int b){
        if(b==0){
            return 0;
        }

        int ans= a+ multiplyOfTwoNumber(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(multiplyOfTwoNumber(5,3));
    }
}
