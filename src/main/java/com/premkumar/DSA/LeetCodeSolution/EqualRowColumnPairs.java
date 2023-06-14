package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EqualRowColumnPairs {

    public static void main(String[] args) {
        //  System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println(equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 4}, {2, 4, 2, 2}, {2, 5, 2, 2}}));
    }

    static public int equalPairs(int[][] grid) {
        int count = 0;
        Map<String, Integer> s = new HashMap<>();


        for (int[] value : grid) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                str.append("").append(value[j]);
            }
                s.put(str.toString(), 1);

            str.setLength(0);
        }
        for (int k = 0; k < grid.length; k++) {
            StringBuilder str = new StringBuilder();
            for (int[] ints : grid) {
                str.append("").append(ints[k]);
            }
            if (s.containsKey(str.toString())) {
                count++;
            } else {
                s.put(str.toString(), 1);
            }
            str.setLength(0);
        }
        return count;
    }

}
