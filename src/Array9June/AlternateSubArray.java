package Array9June;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternateSubArray {
    public static  void solve(int[] A,int B) {

        int N=A.length;

        ArrayList<Integer>indexs=new ArrayList<>();
        for (int i=B;i<N-B;i++){
            int flag=0;
            for (int j=i-B;j<i+B;j++) {
               if(A[j]==A[j+1]){

                   flag=1;
               }

            }
            if(flag==0){
                indexs.add(i);
            }

        }
        int []C=new int[indexs.size()];
       for (int i=0;i< C.length;i++){
          C[i]=indexs.get(i);
       }




         System.out.println(Arrays.toString(C));
    }
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 1, 0, 1};

        solve(A,1);

    }
}
