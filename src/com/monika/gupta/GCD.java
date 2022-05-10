package com.monika.gupta;

import java.util.Scanner;
//Problem Description
//
//        Write a program to input an integer T and then T lines each containing two integers A & B from user and print T lines conatining HCF of two given 2 numbers A and B.
//
//
//
//        Problem Constraints
//
//        1 <= T <= 1000
//
//        1 <= A,B <= 1000000
//
//
//
//        Input Format
//
//        First line is T which means number of test cases.
//
//        Each next T lines contain two integers A &B.
//
//
//
//        Output Format
//
//        T lines each containing an integer representing HCF of A & B.
//
//
//
//        Example Input
//
//        Input 1:
//
//        2
//        15 105
//        24 36
//
//
//        Example Output
//
//        Output 1:
//
//        15
//        12
//
//
//        Java 8 (Array Support)


public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=1;j<=n ;j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = 0;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % 1 == 0 && b % i == 0) {
                    gcd = i;

                }
            }
            System.out.println(gcd);
        }
    }
}

