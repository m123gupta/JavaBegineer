package com.monika.gupta.LeetCode;

import java.util.Arrays;

public class MaximumNumberWords {
    public static int mostWordsFound(String[] sentences) {

        int m[]=new int[sentences.length];

        for(int i=0;i<sentences.length;i++){

            String k[]=sentences[i].split(" ");
            int c=0;

            for(int j=0;j<k.length;j++){

                c=c+1;
                m[i]=c;
            }
        }
        for(int y=0;y<m.length;y++){
            for(int j=0;j<m.length;j++){
                if(m[y]>m[j]){
                    int temp=m[j];
                    m[j]=m[y];
                    m[y]=temp;
                }
            }



        }
        return m[0];
    }
    public static void main(String[] args) {

      String k[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int m=mostWordsFound(k);
        System.out.println(m);
    }
}
