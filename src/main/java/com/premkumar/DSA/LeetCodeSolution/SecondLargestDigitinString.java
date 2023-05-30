package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashMap;

public class SecondLargestDigitinString {
    public int secondHighest(String s) {
        HashMap<Integer, Boolean> f = new HashMap<>();
        int second = -1;
        int first = -1;
        for (int i = 0; i < s.length(); i++) {
            int a = checkweatherCharOrInt(s.charAt(i));
            if (a != -1 && !f.containsKey(a)) {
                if (first < a) {
                    f.put(a, true);
                    second = first;
                    first = a;
                } else if (second < a) {
                    second = a;
                }
            }
        }
        if (second == first) return -1;
        else return second;
    }
    public int checkweatherCharOrInt(char ch) {
        if (Character.isDigit(ch)) {
            return ch - '0';
        }
        return -1;
    }

}
