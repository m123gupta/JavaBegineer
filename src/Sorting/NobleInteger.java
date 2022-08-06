package Sorting;

import java.util.Arrays;

public class NobleInteger {
    public static  int solve(int[] A) {
        Arrays.sort(A);
        int count=0;
        int elem=1;

        if(A[A.length-1]==0){
            return 1;
        }
        for(int i=A.length-2;i>=0;i--){

            if(A[i]<A[i+1]){
                count=count+elem;
                elem=1;
            }
            else if(A[i]==A[i+1]){
                elem++;
            }
            if(A[i]==count){
                return 1;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int A[]={5, 6, 2};

        int b= solve(A);
        System.out.println(b);
    }
}
