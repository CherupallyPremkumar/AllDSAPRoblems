package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        while (inLoop.add(n)) {
            int sum = 0;
            while (n > 0) {
                int v = n % 10;
                sum += v * v;
                n = n / 10;
            }
            if (sum == 1) return true;
            else n = sum;
        }
        return false;
    }
}

