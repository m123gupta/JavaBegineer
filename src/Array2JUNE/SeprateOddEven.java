package Array2JUNE;

import java.util.Arrays;
import java.util.Scanner;

public class SeprateOddEven {
    public static void printArray(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) {
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void seprateOddEven(int []arr) {
       int []odd=new int[arr.length];
        int []even=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

          if(arr[i]%2==0){
              System.out.println(arr[i]);
              even[i]=arr[i];

          }

            if(arr[i]%2!=0){

                odd[i]=arr[i];

            }

        }
       int []even1=new int[even.length];
        for(int i=0;i<even1.length;i++){
            if(even[i]!=0) {
                even1[i] = even[i];
            }
        }

        int []odd1=new int[odd.length];
        for(int i=0;i<odd1.length;i++){
            if(odd[i]!=0) {
                odd1[i] = odd[i];
            }
        }


       printArray(odd1);
        System.out.println();
        printArray(even1);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int j=1;j<=n;j++) {
            int m= sc.nextInt();
            int []arr=new int[m];
            for (int i = 0; i < m; i++) {

                arr[i] = sc.nextInt();
            }

           seprateOddEven(arr);




        }

    }
}
