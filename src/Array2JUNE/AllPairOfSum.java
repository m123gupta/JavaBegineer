package Array2JUNE;

import java.util.Scanner;

public class AllPairOfSum {
    public static int solve(int[] A, int B) {

        int c = 0;
        int i=0;
        int j=A.length-1;
        while(i<j){
            int total=A[i]+A[j];
            if(total<B)
            {
                i++;
            }
            else if(total==B){
                c=c+1;
                i++;
                j--;

            }
            else if(total>B){

                j--;
            }
        }

        if(c>0){
            return 1;
        }
        else {
            return 0;
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int m = solve(arr, k);
        System.out.println(m);
    }
}
