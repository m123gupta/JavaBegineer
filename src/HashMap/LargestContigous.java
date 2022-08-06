package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LargestContigous {
    public static int[] solve(int [] A){
        HashMap <Integer,Integer> map=new HashMap();
        ArrayList<Integer> s=new ArrayList<>();
         int start=-1;

         int end=-1;
        int sum=0;
       int len=0;
         map.put(0,-1);

        // Pick a starting point
        for (int i = 0; i <A.length; i++) {
            sum+=A[i];
            // Initialize currr_sum for
            // every starting point

            if(map.containsKey(sum)){
                if(len < (i-map.get(sum))){
                    len = i-map.get(sum);
                    start = map.get(sum)+1;
                    end = i;

                }
            }
            else {
                map.put(sum, i);
            }
        }
       System.out.println(start);
        System.out.println(end);
        System.out.println(len);
        int l=0;
        int[] res = new int[0];
        if(start != -1 && end!= -1){ // If zero subarray is not present
            res = new int[end-start+1];
            for(int i=start;i<=end;i++)
                res[l++] = A[i];
        }
        return res;



    }
    public static void main(String[] args) {
        int  A []= {0, 22, 7, 21, -11, -6, -7, -16, -2};
       int arr[]= solve(A);
        System.out.println(Arrays.toString(arr));
    }

}
