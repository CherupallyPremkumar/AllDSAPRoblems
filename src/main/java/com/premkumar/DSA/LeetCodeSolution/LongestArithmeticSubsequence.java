package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashMap;

public class LongestArithmeticSubsequence {
    public static void main(String[] args) {
        longestArithSeqLength(new int[]{3,6,9,12});
    }
    static int a=0;
        public static int longestArithSeqLength(int[] nums) {

            int length=nums.length;

            HashMap<Integer,Integer>[] dp=new HashMap[length];
            int maxValue=1;
            for (int i = 0; i <length ; i++) {

               dp[i]=new HashMap<>();

                for (int j = 0; j < i; j++) {

                    int difference=nums[i]-nums[j];

                    int value=dp[j].getOrDefault(difference,0)+1;

                    dp[i].put(difference,value);

                    maxValue=Math.max(maxValue,dp[i].get(difference));
                }
            }
            return (maxValue+1);
        }

}
