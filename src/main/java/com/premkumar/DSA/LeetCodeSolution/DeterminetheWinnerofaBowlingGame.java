package com.premkumar.DSA.LeetCodeSolution;

public class DeterminetheWinnerofaBowlingGame {

    public static void main(String[] args) {
        System.out.println( isWinner(new int[]{10,2,2,3},new int[]{3,8,4,5}));
    }
    public static int isWinner(int[] nums, int[] nums2) {
        int sum = nums[0];
        int sum2 = nums2[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 10 || i - 2 >= 0 && nums[i - 2] == 10) {
                sum += 2 * nums[i];
            } else {
                sum += nums[i];
            }
            if (nums2[i - 1] == 10 || i - 2 >= 0 && nums2[i - 2] == 10) {
                sum2 += 2 * nums2[i];
            } else {
                sum2 += nums2[i];
            }
        }
        if (sum > sum2) return 1;
        else if (sum < sum2) return 2;
        else return 0;
    }
}

