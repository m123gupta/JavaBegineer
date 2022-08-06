package com.monika.gupta;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void reverseString(String s){
                String rev="";
                char ch;
                for(int i=0;i<s.length();i++){
                    ch= s.charAt(i);
                    rev= ch+rev;
                }
        System.out.println(rev);

    }

    public  static void binaryToDecimalConversion(int n){
        String sum="";

        for(int i=0;n>0;i++){
          int  mod=n%2;

            sum=sum+mod;
            n=n/2;

        }
        reverseString(sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++) {
            int k= sc.nextInt();
            binaryToDecimalConversion(k);
        }
    }
}
