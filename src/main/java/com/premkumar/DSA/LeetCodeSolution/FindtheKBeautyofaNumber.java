package com.premkumar.DSA.LeetCodeSolution;

public class FindtheKBeautyofaNumber {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(430043, 2));
    }

    static public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int first = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i - first == k - 1) {

                String c = String.valueOf(num);
                int value = getTheNumber(first, i, c);
                if (validatedivisor(value, num)) count++;
                first++;
            }
        }
        return count;
    }

    static private int getTheNumber(int first, int i, String str) {
        return Integer.parseInt(str.substring(first, i + 1));
    }

    static private boolean validatedivisor(int value, int num) {
        if (value == 0) return false;
        return num % value == 0;
    }
}

