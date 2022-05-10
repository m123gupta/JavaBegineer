package com.monika.gupta;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        int sum = 0;
        int rem=n;

        for (; n>0; ) {

            sum=sum*10 + n%10;
            n=n/10;
        }

            if (sum == rem) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

    }
    }