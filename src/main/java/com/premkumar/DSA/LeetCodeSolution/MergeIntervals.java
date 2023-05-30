package com.premkumar.DSA.LeetCodeSolution;


import java.util.Arrays;
import java.util.Comparator;


public class MergeIntervals implements Comparator<int[]> {
    public int compare(int[] frst, int[] scnd) {
        return Integer.compare(frst[0], scnd[0]);
    }
    public static void main(String[] args) {
        merge(new int[][]{{2, 6}, {1, 3}, {8, 10}, {15, 18}});
    }
  private static int[][] removeZero(int[][] arr,int k)
  {
      int[][] result = new int[k][2];
      for (int i = 0; i < k; i++) {
          result[i][0] = arr[i][0];
          result[i][1] = arr[i][1];
      }
      return result;
  }
    static public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new MergeIntervals());
        int[][] arr = new int[intervals.length][2];
        int k = 0;
        for (int j = 0; j < intervals.length; j++) {
            int start = intervals[j][0];
            int end = intervals[j][1];
            if (start != -1) {
                for (int i = j + 1; i < intervals.length; i++) {
                    if (intervals[i][0] != -1 && (intervals[i][0] >= start && intervals[i][0] <= end)) {
                        if (intervals[i][1] > end) {
                            end = intervals[i][1];
                        }
                        intervals[i][0] = -1;
                    }
                }
                arr[k][0] = start;
                arr[k][1] = end;
                k++;
            }
        }
        // Create a new array with only the non-zero elements from arr
        return  removeZero(arr,k);
    }


}

