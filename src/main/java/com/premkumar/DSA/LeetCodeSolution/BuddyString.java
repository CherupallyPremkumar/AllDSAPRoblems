package com.premkumar.DSA.LeetCodeSolution;

import java.util.*;

public class BuddyString {
    public static void main(String[] args) {
        buddyStringss("abcd","cbad");
    }
    static public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                char swap = a[i];
                a[i] = a[j];
                a[j] = swap;
                if (new String(a).equals(goal)) {
                    return true;
                }
                char swap1 = a[i];
                a[i] = a[j];
                a[j] = swap1;
            }
        }
        return false;
    }
   static public boolean buddyStringss(String A, String goal) {
        if (A.length() != goal.length()) return false;
        if (A.equals(goal)) {

        }
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < A.length(); ++i)
        {
            if (A.charAt(i) != goal.charAt(i)) {
                dif.add(i);
            }
        }
        if(dif.size() == 2 && A.charAt(dif.get(0)) == goal.charAt(dif.get(1)) && A.charAt(dif.get(1)) == goal.charAt(dif.get(0))) return true;
        else return false;

    }
}

