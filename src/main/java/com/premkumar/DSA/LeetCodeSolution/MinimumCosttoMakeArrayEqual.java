package com.premkumar.DSA.LeetCodeSolution;

public class MinimumCosttoMakeArrayEqual {
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{735103, 366367, 132236, 133334, 808160, 113001, 49051, 735598, 686615, 665317, 999793, 426087, 587000, 649989, 509946, 743518}, new int[]{724182, 447415, 723725, 902336, 600863, 287644, 13836, 665183, 448859, 917248, 397790, 898215, 790754, 320604, 468575, 825614}));
    }
    //This Approach has raised time limit exceed error So it looks like O(n^2) time complexity
    public static long minCost(int[] nums, int[] cost) {
        long min = Long.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, minCost2(nums, cost, num));
        }
        return min;
    }
    private static long minCost2(int[] nums, int[] cost, int v) {
        long sum = 0L;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + cost[i] * (long) Math.abs(v - nums[i]);
        }
        return sum;
    }
}



