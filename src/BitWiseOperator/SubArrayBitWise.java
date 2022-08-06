package BitWiseOperator;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayBitWise {
    public static  void solve(int[] A,int B) {

        int N=A.length;
        int flag=0;
        for (int i = 0; i < B; i++) {
            if(A[i]==0){
                flag=flag+0;
            }
            else {
                flag=flag+1;
            }
        }
        for (int i = 1; i <= A.length - B; i++) {

            for (int j=i-B;j<i+B;j++) {
                if(A[j]==0){
                    flag=flag+0;
                }
                else {
                    flag=flag+1;
                }

            }
        }






        System.out.println(flag);
    }
    public static void main(String[] args) {
        int[] A = {1,0,1};

        solve(A,3);

    }
}
