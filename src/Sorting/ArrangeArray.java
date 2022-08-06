package Sorting;

import java.util.Arrays;

public class ArrangeArray {

    public static  int solve(int[] A){
        System.out.println(Arrays.toString(A));
        int m=A[1]-A[0];
        int diff=0;
        for(int i=0;i<A.length-1;i++){
            diff=0;

            if(A[i+1]-A[i]!=m ){
              return  0;

            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int A[]={ 97,-53};




        Arrays.sort(A);
        int k=solve(A);

            System.out.println(k);

    }
}
