package Recursion;

public class ImplemetPowerFunction {
    public static  int multiplyOfTwoNumber(int a,int b,int c){
        System.out.println(b);
        if(b==0){
            return 1;
        }


            return a * multiplyOfTwoNumber(a, b - 1, c) % c;


    }
    public static void main(String[] args) {
        System.out.println(multiplyOfTwoNumber(2,3,3));
    }
}
