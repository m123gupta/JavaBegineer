package com.monika.gupta;

import java.util.Scanner;

//Output:-
//
//        ____* // 4 spaces
//
//        ___** // 3 spaces
//
//        __*** // 2 spaces
//
//        _**** // 1 space
//
//        ***** // 0 space
public class pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){

                System.out.print(' ');


            }
            for(int j=1;j<=i;j++){

                    System.out.print('*');


            }


            System.out.println();
        }

    }
}
