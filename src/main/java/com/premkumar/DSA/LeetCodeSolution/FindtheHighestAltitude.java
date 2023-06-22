package com.premkumar.DSA.LeetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-59,-27,-7,-24,69,80,-22,-53}));
    }
        static public int largestAltitude(int[] gain) {
            List<Integer> lis=new ArrayList<>();
             lis.add(2);
             lis.add(3);
             lis.add(4);
             lis.add(5);
             lis.add(6);
            for (Integer a: lis) {
                System.out.print(a+" ");
            }
           Integer l= lis.remove(lis.size()-1);
           lis.add(0,l);
            System.out.println();
            for (Integer a: lis) {
                System.out.print(a+" ");
            }

            int value=0;
            int max=0;
            for (int j : gain) {
                value = value + j;
                max = Math.max(value, max);
            }
            return max;
        }
}
