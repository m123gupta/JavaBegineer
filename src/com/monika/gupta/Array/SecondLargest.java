package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void SecondLargest(int[] arr) {
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;

                } else if (arr[i]==arr[j]) {
                  ans=-1;
                }
            }
        }
        if(ans==-1 || arr.length==1) {
            System.out.println("NA");

        }
        else {
            System.out.println(arr[arr.length - 2]);
        }
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

           SecondLargest(arr);

    }
}
