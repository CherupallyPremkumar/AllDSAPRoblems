package com.premkumar.DSA.LeetCodeSolution;


public class DifferenceBetweenElementSumandDigitSumofanArray {
    public int differenceOfSum(int[] nums) {
        int normalSum = 0;
        int depthSum = 0;
        for (int num : nums) {
            normalSum += num;
            if (num > 9) {
                depthSum += differenceOfSum(num);
            } else {
                depthSum += num;
            }
        }
        return normalSum - depthSum;
    }
    public int differenceOfSum(int num) {

        int single = 0;
        while (num > 0) {
            single += num % 10;
            num = num / 10;
        }
        return single;
    }
    }

