package com.monika.gupta;

import java.util.Scanner;

//Output:-
//
//        ********** // 0 spaces
//
//        ****__**** // 2 spaces
//
//        ***____*** // 4 spaces
//
//        **______** // 6 spaces
//
//        *________* // 8 spaces
public class pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {

            for (int j = 1; j <= n-(i-1); j++) {

                System.out.print('*');
            }
            for (int k = 1; k <= (i-1)*2; k++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= n-(i-1); j++) {

                System.out.print('*');
            }
            System.out.println();
        }
    }
}
