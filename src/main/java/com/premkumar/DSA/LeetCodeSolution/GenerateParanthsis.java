package com.premkumar.DSA.LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthsis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    static public List<String> generateParenthesis(int n) {
        return gen("", 0, 0, n, new ArrayList<String>());
    }

    static private List<String> gen(String s, int open, int close, int n, List<String> list) {
        if (s.length() == n * 2) {
            list.add(s);
        }
        if (open < n) {
            gen(s + "(", open + 1, close, n, list);
        }
        if (close < open) {
            gen(s + ")", open, close + 1, n, list);
        }

        return list;
    }
}

