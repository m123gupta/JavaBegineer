package Recursion;

public class SumOfDigit {
    public static int isReverseString(int a)
    {

        if(a==0){
            return 0;
        }
        return a % 10 + (isReverseString(a / 10));


    }

    public static void main(String[] args) {
      int A=46;
        System.out.println(isReverseString(A));
    }
}
