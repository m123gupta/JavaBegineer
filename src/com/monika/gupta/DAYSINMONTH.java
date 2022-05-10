package com.monika.gupta;

import java.util.Scanner;
//You are given an integer A.
//
//        You have to tell how many days are there in the month denoted by A in a non-leap year.
//
//        Months are denoted as follows:
//
//        January : 1
//        February : 2
//        March : 3
//        April : 4
//        May : 5
//        June : 6
//        July : 7
//        August : 8
//        September : 9
//        October : 10
//        November : 11
//        December : 12
//
//
//        Problem Constraints
//
//        1 <= A <= 12
//
//
//
//        Input Format
//
//        The input contains a single integer A.
//
//
//
//        Output Format
//
//        Print a single integer denoting the number of days on a single line.
//
//
//
//        Example Input
//
//        Input 1:
//
//        1
//        Input 2:
//
//        11
//
//
//        Example Output
//
//        Output 1:
//
//        31
//        Output 2:
//
//        30
//
//
//        Example Explanation
//
//        Explanation 1:
//
//        Number of days in January(1) in a non-leap year = 31.
//        Explanation 2:
//
//        Number of days in November(11) in a non-leap year = 30.
//
//

public class DAYSINMONTH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       if(1 <= n && n <= 12){
           if(n==4 || n==6 ||n==9 ||n==11){
               System.out.println(30);
           } else if (n==2) {
               System.out.println(28);
           }
           else {
               System.out.println(31);
           }

       }
    }
}
