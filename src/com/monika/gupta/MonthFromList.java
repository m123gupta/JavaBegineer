package com.monika.gupta;

import java.util.Scanner;

public class MonthFromList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       String [] arr={"January", "February", "March", "April", "May", "June", "July",
               "August", "September", "October", "November", "December"};
       int i=1;
        System.out.println(arr[n-1]);
    }
}
