package com.monika.gupta;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int lcm=0;
            int gcd = 0;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;

                }
            }
            lcm=a*b/gcd;
            System.out.println(lcm);

    }
}
