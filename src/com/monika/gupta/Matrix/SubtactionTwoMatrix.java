package com.monika.gupta.Matrix;

import java.util.ArrayList;

public class SubtactionTwoMatrix {
    public  static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer> > arrayList=new ArrayList<>();
        ArrayList arr1=new ArrayList<>();

        for (int i=0;i<A.get(i).size();i++){
            System.out.println(A.get(i).size());
            for(int j=0;j<A.get(i).size();j++){
                System.out.println("ghjkl"+j);
                int val=A.get(i).get(j)-B.get(i).get(j);

                arr1.add(A.get(i).set(j,val));
            }

        }
        arrayList.add(arr1);
        print2DArray(arrayList);

        return arrayList;
    }
    public static void print2DArray(ArrayList<ArrayList<Integer> > arrayList){

        int rows = arrayList.size();
        for(int i=0; i < rows; i++){
            // how to print the ith row
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j < arrayList.get(i).size() ; j++){
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arrayList=new ArrayList<>();
        ArrayList <Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(-3);


        ArrayList <Integer> arr2=new ArrayList<>();
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);

        arrayList.add(arr1);
        arrayList.add(arr2);
        ArrayList<ArrayList<Integer> > arrayList1=new ArrayList<>();
        ArrayList <Integer> arr3=new ArrayList<>();
        arr3.add(1);
        arr3.add(-2);
        arr3.add(3);

        ArrayList <Integer> arr4=new ArrayList<>();
        arr4.add(5);
        arr4.add(6);
        arr4.add(7);

        arrayList1.add(arr3);
        arrayList1.add(arr4);


      solve(arrayList,arrayList1);
     //   System.out.println(result);

    }
}
