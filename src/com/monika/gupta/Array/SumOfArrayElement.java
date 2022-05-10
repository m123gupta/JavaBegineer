package com.monika.gupta.Array;

import java.util.Scanner;

public class SumOfArrayElement {
    public static void SumOfArray(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        }
        System.out.print(sum);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            arr[i]=k;

        }

        SumOfArray(arr);
    }
}
