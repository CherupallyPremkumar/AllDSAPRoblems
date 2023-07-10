package com.premkumar.DSA.LeetCodeSolution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {  int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>=target)
                    s=Math.min(s,j-i);
            }
        }
        return s==Integer.MAX_VALUE ? 0 : s+1;
    }
    public static int minSubArrayLenn(int target, int[] nums) throws FileNotFoundException {
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {  int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>=target)
                    s=Math.min(s,j-i);
                FileInputStream fileInputStream=new FileInputStream("");
            }
        }

        return s==Integer.MAX_VALUE ? 0 : s+1;
    }

}
