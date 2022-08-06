package Recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class isMagic {
    public static int isAddSumString(int a)
    {

        if(a==0){
            return 0;
        }

        return a % 10 + (isAddSumString(a / 10));


    }
    public static int solve(int a)
    {

        int res=isAddSumString(a);
        if(a<10){
           return 0;
        }
        if (res==1) {
           return  1;
        }


       return solve(res);
    }



    public static void main(String[] args) {
        int A=1291;
        List list =new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator it= list.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
            list.add(5);
        }

       //System.out.println(solve(A));
    }
}
