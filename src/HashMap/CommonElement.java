package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CommonElement {
    public static int [] solve(int[] A, int[] B) {

            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> s=new ArrayList<>();

            for (int i = 0; i < B.length; i++) {
                hs.add(B[i]);
            }


            for (int j = 0; j < A.length; j++) {
                if (hs.contains(A[j])) {
                  s.add(A[j]);
                }
            }
        int[] arr=new int[s.size()];
        for(int i=0;i<s.size();i++)
        {
            arr[i]=s.get(i);
        }

       return  arr;
    }



    public static void main(String[] args) {
       int  A []= {1, 2, 2, 1};
        int B[] = {2, 3, 1, 2 };
        int s[]=solve(A,B);
        System.out.println(Arrays.toString(s));
    }
}
