package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

//You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not
public class Array3 {
    public static int findMinMax(int []arr,int a) {
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==a){
               flag=1;
           }
        }
//        if (flag==1) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//
//        }
        return  flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int j=1;j<=n;j++) {
            int m= sc.nextInt();
            int []arr=new int[m];

            for (int i = 0; i < m; i++) {
                int k = sc.nextInt();
                arr[i] = k;
            }
            int a= sc.nextInt();
          int k = findMinMax(arr,a);
            System.out.println(k);
//            int a= sc.nextInt();
//

        }

    }
}
