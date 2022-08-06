package com.monika.gupta.LeetCode;

import java.util.Arrays;

public class BuildArrayPermutation {
    public  static  int[] buildArray(int[] nums) {

        int n[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            n[i]=nums[nums[i]];
        }
        return n;
    }


    public static void main(String[] args) {
        int []nums = {0,2,1,5,3,4};
       int[] res= buildArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
