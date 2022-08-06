package com.monika.gupta.Matrix;

import java.util.Arrays;

public class IdenticalMatrix {
    public static  int solve(int [][]arr){
      int r= arr.length;
       int flag=0;
      for(int i=0;i<r;i++){

          for(int j=0;j<arr[0].length;j++){

              if(arr[i][j]!=1 && i==j){
                flag=1;
                break;
              }

              if(i != j && arr[i][j] !=0){
                  System.out.println("in");
                 flag=1;
                 break;
              }

          }
      }
      if(flag==0) {
          return 1;
      }
      else {
          return 0;
      }


    }
    public static void main(String[] args) {

        int[][] arr = { { 1, 1 }, { 0, 1 } };
       int m= solve(arr);
        System.out.println(m);
    }
}
