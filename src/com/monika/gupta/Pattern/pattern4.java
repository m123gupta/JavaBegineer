package com.monika.gupta.Pattern;

//0 0 0 0 1 0 0 0 0
//        0 0 0 2 3 2 0 0 0
//        0 0 3 4 5 4 3 0 0
//        0 4 5 6 7 6 5 4 0
//        5 6 7 8 9 8 7 6 5

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print('0'+" ");
            }
            int val = i;
            for (int j = 1; j <= i; j++) {

                System.out.print(val+" ");
                val = val + 1;
            }

            val = val - 2;
            for (int j = 1; j <= i - 1; j++) {

                System.out.print(val+" ");
                val = val - 1;

        }
            for (int j = 1; j <= n - i; j++) {

                System.out.print('0'+" ");
            }
            System.out.println();
        }
    }
}

