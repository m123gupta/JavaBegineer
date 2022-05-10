package com.monika.gupta;

import java.util.Scanner;

//        1
//        1 2
//        1 2 3
//        1 2 3 4
public class NumberStairPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print(j);
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
