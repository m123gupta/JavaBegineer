package com.monika.gupta.Matrix;

public class EqualMatrix {
    public static  int solve(int [][]arr,int [][]brr){
        int r= arr.length;

        for(int i=0;i<r;i++){
            System.out.println(arr[1].length);
            for(int j=0;j<arr.length;j++){

                if(arr[i][j]!=brr[i][j]){
                    return 0;
                }
            }
        }

            return 1;



    }
    public static void main(String[] args) {

        int[][] arr = { { 1, 0,1 }, { 0, 1 ,4,4} };
        int[][] brr = { { 1, 0 ,1}, { 0, 1 ,4,4} };
        int m= solve(arr,brr);
        System.out.println(m);
    }
}
