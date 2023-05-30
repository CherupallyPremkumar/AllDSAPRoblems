package com.premkumar.DSA.LeetCodeSolution;


//This sorting Algorithm has O(N^2)
//In selection sort, the algorithm selects the smallest or largest element from the unsorted part of the list and places it at the beginning of the sorted part of the list.
// This process is repeated until all elements are in the sorted order.
//The algorithm selects the smallest or largest element greedily,
// as it does not consider the entire list at once,
// but only focuses on finding the minimum or maximum value in the unsorted part of the list.
//
//Therefore, selection sort is considered a greedy approach for sorting a list of items.

public class SelectionSort {


    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
        return arr;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
