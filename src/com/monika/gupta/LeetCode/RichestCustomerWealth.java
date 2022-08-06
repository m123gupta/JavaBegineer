package com.monika.gupta.LeetCode;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum[]=new int[accounts.length];

        for(int i=0;i<accounts.length;i++){
            int N=0;
            for(int j=0;j<accounts[0].length;j++){
                N=N+accounts[i][j];

            }
            sum[i]=N;
        }
        System.out.println(Arrays.toString(sum));
        for(int k=0;k<sum.length-1;k++){
            if(sum[k]>sum[k+1]){
                int m=sum[k+1];
                sum[k+1]=sum[k];
                sum[k]=m;
            }


        }
        int j=sum[sum.length-1];
        return j;
    }
    public static void main(String[] args) {
        int[][]  accounts = {{1,2,5},{3,2,1}};
        int res=maximumWealth(accounts);
        System.out.println(res);
    }
}
