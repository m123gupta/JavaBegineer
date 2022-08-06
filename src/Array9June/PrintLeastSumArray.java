package Array9June;

import java.util.Arrays;

public class PrintLeastSumArray {
    public static  void solve(int[] A,int B) {

        int currSum = 0;
        int outputIndex = 0;
        for (int i = 0; i < B; i++) {
            currSum += A[i];
        }

        int min = currSum;
        for (int i = 1; i <= A.length - B; i++) {
          //  System.out.println(A[i - 1]);
            System.out.println(currSum);
            currSum = currSum - A[i - 1] + A[i + B - 1];

            if (currSum < min) {
                min = currSum;
                outputIndex = i;
            }
        }


        System.out.println(outputIndex);

    }
    public static void main(String[] args) {
        int[] A = {3, 7, 10, 40, 10, 50, 10};

        solve(A,3);

    }
}
