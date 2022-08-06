package com.monika.gupta.PatterProblem2;

import java.util.Scanner;

public class PyramidPatternTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int s= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {

                    System.out.print("* ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
