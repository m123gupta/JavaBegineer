package com.monika.gupta.LeetCode;

import java.util.Arrays;

public class ShuffleArray {
    public static void mostWordsFound(int[] arr,int b) {
        int firstArray[]=new int[b];
        int secondArray[]=new int[b];

        for(int i=0;i<b;i++){
            firstArray[i]=arr[i];
        }
        for(int i=0;i<b;i++){
            secondArray[i]=arr[b+i];
        }
        int c=0;
        for(int i=0;i< arr.length;i++){
            if(i%2==0) {
               arr[i] = firstArray[c];
                c++;
           }
            else {
                arr[i]=0;
            }


       }


        c=0;
        for(int i=0;i< arr.length;i++){
            if(i%2!=0) {
                arr[i] = secondArray[c];
                c++;
            }



        }

        System.out.println(Arrays.toString(arr));



    }
    public static void main(String[] args) {

        int k[]= {2,5,1,3,4,7};
        int n=3;
        mostWordsFound(k,n);
    }
}
