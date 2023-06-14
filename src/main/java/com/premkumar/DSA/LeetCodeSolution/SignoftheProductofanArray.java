package com.premkumar.DSA.LeetCodeSolution;

public class SignoftheProductofanArray {
        public int arraySign(int[] nums) {
            int l=signFunc(nums, 0);
            return Integer.compare(l, 0);
        }
        public int signFunc(int[] num, int i)
        {
            if(num[i]==0) return 0;
            if(num[i]>0 )  return 1;
            if(num[i]<0) return -1;
            int s=1;

            s=Math.multiplyExact(s,signFunc(num,i+1));
            return s;
        }
    }

