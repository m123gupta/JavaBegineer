package com.monika.gupta.Matrix;

import java.util.Arrays;

public class SumRowColumn {
    public static  void solve(int [][]arr){
        int r= arr.length;

        int k[]=new int[arr.length+arr[0].length];
         int c=0;
        for(int i=0;i<r;i++){

            int m=0;

            for(int j=0;j<arr[0].length;j++){
                m=m+arr[i][j];

            }
            k[c]=m;
            c=c+1;
        }
        for(int col=0;col<arr[0].length;col++){

            int m=0;
            for(int row=0;row< arr.length;row++){

                m=m+arr[row][col];

            }
            k[c]=m;
            c=c+1;
        }
        System.out.println(Arrays.toString(k));




    }
    public static void main(String[] args) {

        int[][] arr = {{1, 2},
                       {4, 5},
                       {8, 9}};

       solve(arr);
       // System.out.println(m);
    }
}
