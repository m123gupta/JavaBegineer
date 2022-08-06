package com.monika.gupta.Array;

import java.util.Scanner;

public class StringLength {
    public static String reverseString(String s){
        String rev="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch= s.charAt(i);
            rev= ch+rev;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i=1; i<=n; i++) {
            String k = sc.next();
            String rev=  reverseString(k);
            System.out.println(rev.length());
        }
    }
}
