package com.premkumar.DSA.LeetCodeSolution;

public class MaximumProductSumArray {
    public static void main(String[] args) {
        maxProduct(new int[]{2,3,-2,4});
    }
    public static int maxProduct(int[] nums) {
        //  int max=-11;
        //  for(int i=0;i<nums.length;i++)
        //  {
        //    int sum=1;//   for(int j=i;j<nums.length;j++)
        //  {
        //    sum*=nums[j];
        //    max=Math.max(max,sum);
        //  }

        //  }
        //  return max;
        int prefix=1;
        int sumfix=1;
        int sum=-11;
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0) prefix=1;
            if(sumfix==0) sumfix=1;
            prefix=prefix+nums[i];
            sumfix=sumfix+nums[nums.length-i-1];
            sum= Math.max(sum,Math.max(prefix,sumfix));
        }
        return sum ;
    }
}
