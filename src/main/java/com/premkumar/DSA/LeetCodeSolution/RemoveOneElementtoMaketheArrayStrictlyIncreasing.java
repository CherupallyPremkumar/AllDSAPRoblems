package com.premkumar.DSA.LeetCodeSolution;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] values = {  2,3,1,2 };
        System.out.println(canBeIncreasing(values));
    }
    static public boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        for(int i=1;i<nums.length;i++)
            if(nums[i] <= nums[i-1]) {
                if(removed) return false;
                removed = true;
                if (i>1 && nums[i] <= nums[i-2])
                    nums[i] = nums[i-1];
            }
        return true;
    }
    }



