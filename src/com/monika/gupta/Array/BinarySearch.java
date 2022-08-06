package com.monika.gupta.Array;

public class BinarySearch {
    public  static  int  binarySearch(int []arr,int b){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=(s+e)/2;
            if(b<arr[mid]){
                e=mid-1;
            } else if (b==arr[mid]) {
                return mid;
            }
            else{
               s=mid+1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int []arr={1,6,7,11,12,13,14};
        int b=15;
      int val=  binarySearch(arr,b);
        System.out.println(val);
    }
}
