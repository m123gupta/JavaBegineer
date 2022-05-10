package com.monika.gupta;

//iven an integer N (N >= 2). Print N lines with two stars ('*') in each line with N - 2 spaces in between.
//
//        For example
//
//        Input:-
//
//        5
//
//        Output:-
//
//        *___*
//
//        *___*
//
//        *___*
//
//        *___*
//
//        *___*


import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==5) {
                    System.out.print('*');
                }
                else{
                    System.out.print("-");

                }
            }


            System.out.println();
        }

    }
}
