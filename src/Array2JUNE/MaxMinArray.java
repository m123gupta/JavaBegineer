package Array2JUNE;

import java.util.Scanner;

public class MaxMinArray {
    public static void maxMin(int []arr){
        int max=arr[0];
        int min=arr[0];
       for(int i=0;i< arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
          else if(arr[i]<min){
               min=arr[i];
           }
       }
        System.out.println(max+" "+min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
       maxMin(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }



}
