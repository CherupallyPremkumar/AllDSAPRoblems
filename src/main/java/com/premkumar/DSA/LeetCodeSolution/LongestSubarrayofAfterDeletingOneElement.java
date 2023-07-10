package com.premkumar.DSA.LeetCodeSolution;

public class LongestSubarrayofAfterDeletingOneElement {
    public static void main(String[] args) {
        longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});
    }

    //this approach(Brute force) has more time complexity beacuse it iterate through every index.
    static public int longestSubarray(int[] nums) {
        int max = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, findMax(nums, i));
                zero++;
            }
        }
        if (zero == nums.length) return 0;
        return (max == 0) ? nums.length - 1 : max;
    }

    static int findMax(int[] nums, int i) {
        int max = 0;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (i != j) {
                if (nums[j] == 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
        }
        return max;
    }
}

