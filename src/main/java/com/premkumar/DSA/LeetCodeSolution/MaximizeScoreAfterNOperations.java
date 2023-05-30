package com.premkumar.DSA.LeetCodeSolution;

public class MaximizeScoreAfterNOperations {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,2,3,4,5,6}));
    }

    static public int maxScore(int[] nums) {
        int max = 0;
        int total = 0;
        int literation = 1;
        for (int i = 0; i < nums.length; i++) {
            int add = 0;
            int add2 = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != -1 && nums[j] != -1) {
                    int val = gcp(nums[i], nums[j]);
                    if (max <= val) {
                        add = i;
                        add2 = j;
                        max = val;
                    }
                }
            }
            if (max != 0) {
                total += (literation++) * max;
                nums[add] = -1;
                nums[add2] = -1;

            }
            max = 0;
        }
        return total;
    }

    static public int gcp(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
}

