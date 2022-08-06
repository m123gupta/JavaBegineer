package Array2JUNE;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int []arr,int b,int c){
        int i=b;
        int j=c;
        while (i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]=new int[a];
        int k=sc.nextInt();
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


}