package HashMap;

import java.util.HashMap;

public class RepeatElement {
    public static void solve(int [] A){
        HashMap<Integer,Integer> hm =new HashMap<>();
        int ret=-1;
       for(int i= A.length-1;i>=0;i--){

         if(hm.containsKey(A[i])) {
             ret =A[i];

         }else{
             hm.put(A[i], 1);
         }
       }
        System.out.println(ret);

    }
    public static void main(String[] args) {
        int  A []= {8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3 };
       solve(A);
    }
}
