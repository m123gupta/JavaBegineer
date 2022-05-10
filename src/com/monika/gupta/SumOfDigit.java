package com.monika.gupta;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {

            int n = sc.nextInt();
            int sum = 0;
            for (; n > 0; n = n / 10) {

                sum = sum + n % 10;

            }
            System.out.println(sum);
        }
    }
}
