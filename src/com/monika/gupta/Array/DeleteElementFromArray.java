package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void AddElement(int arr[],int position) {
        for (int i = position-1; i< arr.length-1; i++) {


            arr[i] = arr[i+1];


        }

        for (int i = 0; i<arr.length-1; i++) {

            System.out.print(arr[i] + " ");

        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            arr[i]=k;

        }
        int position=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        AddElement(arr,position);
    }
}
