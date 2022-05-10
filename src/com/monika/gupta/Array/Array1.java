package com.monika.gupta.Array;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to input N numbers array from user and insert an element Y in it at specified position X.
public class Array1 {
    public static void AddElement(int arr[], int element, int position,int n) {


        for (int i = n-1; i >= position-1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position-1]=element;
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            arr[i]=k;

        }
        int position=sc.nextInt();
        int element=sc.nextInt();
        AddElement(arr,element,position,n);
    }
}
