package Array14june;

import java.util.Arrays;

public class christmastree {
public static int minimum(int A,int B){
    if(A>B){
        return B;
    }
    else {
        return A;
    }
}
        public static  void solve(int[]A,int[]B) {
            int n=A.length;
        int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++) {
           if (B[i] < min) {
               for (int j = i + 1; j < n; j++) {
                   if (A[i] < A[j] && B[i] + B[j] < min) {
                       for (int k = j + 1; k < n; k++) {
                           if (A[j] < A[k]) {
                               int sum = 0;
                               sum = B[i] + B[j] + B[k];
                               min = minimum(sum, min);
                           }

                       }
                   }
               }
           }
       }

       System.out.println((min == Integer.MAX_VALUE) ? -1 : min);
    }
    public static void main(String[] args) {
    int A[]={5, 9, 10, 4, 7, 8 };
     int B[]={5, 6, 4, 7, 2, 5 };
        solve(A,B);

    }
}
