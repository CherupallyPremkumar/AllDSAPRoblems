package com.premkumar.DSA.LeetCodeSolution;


public class ProgramtosortanarrayoftringsusingSelectionSort {
    public String[] sort(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (checkGreaterOrder(arr, i, j)) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }
    private static boolean checkGreaterOrder(String[] arr, int i, int j) {
       if(arr[i].compareTo(arr[j])>0) return true;
       else return false;
    }

    private static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
