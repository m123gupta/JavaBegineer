package com.monika.gupta.Matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void print2DArray(int[][] arr){

        int rows = arr.length;
        for(int i=0; i < rows; i++){
            // how to print the ith row
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static  void solve(int [][]arr){
        int r= arr.length;
         int k[][]=new int[arr[0].length][arr.length];

        for(int col=0;col<arr[0].length;col++){
            for(int row=0;row< arr.length;row++){
                k[col][row]=arr[row][col];

            }

        }
        print2DArray(k);
    //    System.out.println(Arrays.toString(k));



    }
    public static void main(String[] args) {

        int[][] arr = {
                {21, 62, 16, 44, 55, 100, 16, 86, 29},
                {62, 72, 85, 35, 14, 1, 89, 15, 73},
                {42, 44, 30, 56, 25, 52, 61, 23, 54},
                {5, 35, 12, 35, 55, 74, 50, 50, 80},
                {2, 65, 65, 82, 26, 36, 66, 60, 1},
                {18, 1, 16, 91, 42, 11, 72, 97, 35},
                {23, 57, 9, 28, 13, 44, 40, 47, 98}
              };

      solve(arr);

    }
}
