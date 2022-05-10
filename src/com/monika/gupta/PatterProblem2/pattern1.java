package com.monika.gupta.PatterProblem2;

import java.util.Scanner;

public class pattern1 {
    public static long BinaryToDecimal(long n){
        double decimal=0;
        for(int i=0;n>0;i++){
            long bin=n%10;
            decimal=decimal+bin*Math.pow(2,i);
            n=n/10;
        }
        return  (long)decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
       long result= BinaryToDecimal(n);
        System.out.println(result);
    }
}
