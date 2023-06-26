package com.premkumar.DSA.Interview;

import java.util.PriorityQueue;

public class lottoryCoupon {
    public static void main(String[] args) {
        System.out.println(lotteryCoupons(9));
    }
    public static int lotteryCoupons(int n) {
        PriorityQueue<Integer> a=new PriorityQueue<>();

        int maxWinners = 0;  // maximum number of winners
        int[] sums = new int[9 * n + 1];  // array to store the count of coupons for each sum of digits

        for (int i = 1; i <= n; i++) {
            int sum = calculateSumOfDigits(i);
            sums[sum]++;

            if (sums[sum] > maxWinners) {
                maxWinners = sums[sum];
            }
        }

        int count = 0;
        for (int i = 1; i <= 9 * n; i++) {
            if (sums[i] == maxWinners) {
                count++;
            }
        }

        return count;
    }

    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
