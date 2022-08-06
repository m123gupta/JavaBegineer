package Array2JUNE;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeft {
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

        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int sum[]={2,3};

        int arr2[][]=new int[sum.length][a];
        for(int k=0;k<sum.length;k++){
            for(int j=0;j<arr.length;j++){
               arr2[k][j]=arr[j];
            }
        }

    for(int i=0;i< sum.length;i++) {
        int val=sum[i]%a;
        System.out.println(val);
        reverseArray(arr2[i], 0, arr.length- 1);
        reverseArray(arr2[i], arr.length- val, arr.length - 1);
        reverseArray(arr2[i], 0, arr.length - (val + 1));


    }

        for(int k=0;k<sum.length;k++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr2[k][j]+" ");

            }
            System.out.println();
        }


    }



}
