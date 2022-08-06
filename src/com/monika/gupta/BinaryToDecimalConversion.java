package com.monika.gupta;

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public  static void binaryToDecimalConversion(int n){
        int sum=0;
        for(int i=0;n>0;i++){
            int mod=n%10;
            int power=(int)Math.pow(2,i);
             sum=sum+(mod*power);
             n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        binaryToDecimalConversion(n);
    }
}
