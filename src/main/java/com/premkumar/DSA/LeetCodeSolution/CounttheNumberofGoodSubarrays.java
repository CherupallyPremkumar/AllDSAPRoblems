package com.premkumar.DSA.LeetCodeSolution;

public class CounttheNumberofGoodSubarrays {
    //Time Exceeding
    public long countGood(int[] nums, int k) {
        long subArrayCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (countGood(i, j, nums, k)) subArrayCount++;

            }
        }
        return subArrayCount;
    }

    public boolean countGood(int start, int end, int[] nums, long k) {
        long count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count >= k;
    }
}
