package com.premkumar.DSA.LeetCodeSolution;

public class PutMarblesinBags {
    public static void main(String[] args) {
        putMarbles(new int[]{1, 3, 5, 1}, 2);
    }

    static public long putMarbles(int[] weights, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int value = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i > 0 && i < weights.length - 1) {
                value = (weights[0] + weights[i]) + (weights[i + 1] + weights[weights.length - 1]);
            } else {
                if (i == 0) {
                    value = (weights[i] + weights[i]) + (weights[i + 1] + weights[weights.length - 1]);
                } else if (i == weights.length - 1) {
                    value = (weights[i] + weights[i]) + (weights[0] + weights[i - 1]);
                }
            }
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return max - min;
    }
}

