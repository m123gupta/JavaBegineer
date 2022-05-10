package com.monika.gupta.Pattern;

import java.util.Scanner;

//    *________* // 8 spaces
//
//            **______** // 6 spaces
//
//            ***____*** // 4 spaces
//
//            ****__**** // 2 spaces
//
//            ********** // 0 spaces
public class pattern2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print('*');
            }
            for (int j = 1; j <= 2*(n-i); j++) {

                System.out.print(' ');
            }
            for (int j = 1; j <=i; j++) {

                System.out.print('*');
            }
            System.out.println();
        }
    }
}
