package BitWiseOperator;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumberIII {
    public static void solve(int[] A) {
        int res=0;
        int pos=0;
        for(int x:A){
            res=res^x;
        }

        while((res&1)!=1){
            pos=pos+1;
            res=res>>1;
        }
        int C=0;
        int B=0;
        int lis[]=new int[2];
        for(int x:A){
            if((x&(1<<pos))>0){
                C=C^x;
            }
            else{
                B=B^x;
            }
        }
        if(C>B){
            lis[0]=B;
            lis[1]=C;
        }
        else{
            lis[0]=C;
            lis[1]=B;
        }

        System.out.println(Arrays.toString(lis));

    }
    public static void main(String[] args) {
        int A[]={2308, 1447, 1918, 1391, 2308, 216, 1391, 410, 1021, 537, 1825, 1021, 1729, 669, 216, 1825, 537, 1995, 805, 410, 805, 602, 1918, 1447, 90, 1995, 90, 1540, 1161, 1540, 2160, 1235, 1161, 602, 880, 2160, 1235, 669};
        System.out.println("HI");
        solve(A);
    }
}
