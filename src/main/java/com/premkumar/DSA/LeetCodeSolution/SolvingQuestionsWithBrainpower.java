package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashMap;

public class SolvingQuestionsWithBrainpower {

    public static void main(String[] args) {
        System.out.println(mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
    }

    public static long mostPoints(int[][] questions) {
        return helper(questions, 0);
    }

   static private long helper(int[][] questions, int index) {
        Integer.toBinaryString(9);

        if(index >= questions.length) return 0;
        long skip = helper(questions, index + 1);
        long consider = helper(questions, index + questions[index][1] + 1) + questions[index][0];

        return Math.max(consider, skip);

    }
    }


