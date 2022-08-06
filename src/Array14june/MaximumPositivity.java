package Array14june;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPositivity {
    public static void solve(int[] A) {


                int n = A.length;
                int len = 0, maxLen = 0, index = -1;
                for (int i = n - 1; i >= 0; i--) {
                    if (A[i] >= 0) {
                        len++;
                    } else {
                        if (len >= maxLen) {
                            maxLen = len;
                            index = i + 1;
                        }
                        len = 0;
                    }
                }
                if (len >= maxLen) {
                    maxLen = len;
                    index = 0;
                }
                int[] ans = new int[maxLen];
                int k = 0;
                for (int i = index; i < index + maxLen; i++) {
                    ans[k++] = A[i];
                }

                System.out.println(Arrays.toString(ans));


            }


    public static void main(String[] args) {
        int [] A={-4970494, -664439, -3649300, -3123623, -6310530, 5544106, -4558683, -2209137, -6016890, 112968 };
        solve(A);
    }
}
