package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FrequecncyOfEachElement {
    public static int[] frequecnyOfElement(int[] arr) {
        int f[]=new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int count = 0;


            for (int j = 0; j < arr.length; j++) {
              if (arr[i] == arr[j]) {
                    count = count + 1;

                }
                f[i]=count;

            }

        }
        return f;
    }
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }
      int []res=  frequecnyOfElement(arr);
        printArray(res);
    }
}
