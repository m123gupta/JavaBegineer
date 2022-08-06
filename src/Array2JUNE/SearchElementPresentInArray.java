package Array2JUNE;

import java.util.Scanner;

public class SearchElementPresentInArray {
    public static int findMinMax(int []arr,int a) {
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                flag=1;
            }
        }


        return  flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int j=1;j<=n;j++) {
            int m= sc.nextInt();
            int []arr=new int[m];

            for (int i = 0; i < m; i++) {
                int k = sc.nextInt();
                arr[i] = k;
            }
            int a= sc.nextInt();
            int k = findMinMax(arr,a);
            System.out.println(k);
//            int a= sc.nextInt();
//

        }

    }
}
