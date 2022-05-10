package com.monika.gupta;

import java.util.Scanner;

public class printInSingleLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
//        for (int k = 1; k <= n; k++) {
//
//            System.out.print('*');
//        }

        //printMatrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                System.out.print('*');

            }
            System.out.println();
        }
    }
}

