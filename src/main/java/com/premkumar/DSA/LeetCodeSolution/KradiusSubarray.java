package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;

public class KradiusSubarray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{40527,53696,10730,66491,62141,83909,78635,18560}, 2)));
    }

    static public int[] getAverages(int[] nums, int k) {
        if(k==0) return nums;
        int val = k + k + 1;
        int s = 0;
        int[] n = new int[nums.length];
        Arrays.fill(n,-1);
        long[] m = new long[nums.length];
        for (int i = 0; i < nums.length; i++)
            m[i] = s = s + nums[i];
        for (int i = k; i < nums.length-k; i++)
            if (i == k) n[i] = (int)m[i+k] / val;
            else
               if (i + k > nums.length) n[i] = -1;
               else n[i] = (int)(m[i + k] - m[i - k] + nums[i-k]) / val;
        return n;

    }

}

