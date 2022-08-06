package com.monika.gupta.Array;

public class DuplicateValueInBinarySearch {
    public  static int binarySearch(int []arr,int b){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while (s<=e){
            int mid=(s+e)/2;
            if(b<arr[mid]){
                e=mid-1;
            } else if (b==arr[mid]) {

                ans=mid;
                e=mid-1;
                //s=mid+1;
            }
            else{
                s=mid+1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int []arr={1,2,2,2,2,13,2};
        int b=2;
        int val=  binarySearch(arr,b);
        System.out.println(val);
    }
}
