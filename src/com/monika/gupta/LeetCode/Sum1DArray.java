package com.monika.gupta.LeetCode;

import java.util.Arrays;

public class Sum1DArray {
    public static  int[] runningSum() {
        int []nums = {1,2,3,4};
        int n[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum=0;

            for(int j=0;j<=i;j++) {
                sum = nums[j]+sum;

            }
            n[i]=sum;
        }


        return n;
    }

    public static void main(String[] args) {
        int [] res=runningSum();
        System.out.println(Arrays.toString(res));
    }
}
