package com.monika.gupta.Array;

import java.util.Scanner;
//MIX MIN ARRAY
public class Array2 {
    public static void findMinMax(int []arr){
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]>max){
                max=arr[i];
            }
            if(i==0 || arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(max+" ");
        System.out.print(min);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            arr[i]=k;

        }

        findMinMax(arr);
    }
}

