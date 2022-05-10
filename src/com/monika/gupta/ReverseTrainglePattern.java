package com.monika.gupta;

import java.util.Scanner;

public class ReverseTrainglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){

                    System.out.print('*');

            }
            System.out.println();
        }
    }
}
