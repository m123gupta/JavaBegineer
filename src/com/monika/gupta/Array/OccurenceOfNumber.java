package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

public class OccurenceOfNumber {

    public static int[] ascendingOrder(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;

                }
            }
        }
     return arr;

    }
public static void occurenceOfNumber(int []arr) {
      int f[]=new int[arr.length];
    int t=0;
    for (int i = 0; i <arr.length; i++) {
        int count=0;


        for (int j = 0; j <arr.length; j++) {
            if(i==j){}
            else if (arr[i] == arr[j]) {
               // System.out.println(arr[j]);
                count = count+1;
            }

        }
        if(count==0) {
           // System.out.println(arr[i]);
            f[t]=arr[i];
            t++;

        }

    }
    int arrangeArray[]=new int[t];
    for(int i=0;i<arrangeArray.length;i++){
        arrangeArray[i]= f[i];
    }
   int[]smallArray= ascendingOrder(arrangeArray);
    printArray(smallArray);
}
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        for(int m=0;m<k;m++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            occurenceOfNumber(arr);
        }


       // System.out.println(Arrays.toString(arr));


    }
}
