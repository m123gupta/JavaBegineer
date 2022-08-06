package Array11june;

import java.util.Arrays;

public class RotateMATRIX {


    public static void swap(int A[][]){
        transposePrint(A);
        int cols=A[0].length-1;
        for(int i=0;i<A.length;i++){
            cols=A[0].length-1;
            for(int j=0;j<A[0].length-1;j++){
                System.out.print("j"+j+" ");
                int temp=A[i][j];
                A[i][j]=A[i][cols];
                A[i][cols]=temp;
                cols--;
            }


        }
        System.out.println();
        transposePrint(A);
    }
    public static void transposePrint(int[][] A) {

        for(int i=0;i<A.length;i++){
                System.out.println(Arrays.toString(A[i]));

        }

    }
    public static  void solve(int[][] A) {
        for (int i=0;i<A.length;i++)
        {
            for (int j=i;j<A[0].length;j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }

        swap(A);
    }






    public static void main(String[] args) {
        int A[][]={{31, 32, 228, 333}, {79, 197, 241, 246},{77, 84, 126, 337},{110, 291, 356, 371}};
        solve(A);
    }
}
