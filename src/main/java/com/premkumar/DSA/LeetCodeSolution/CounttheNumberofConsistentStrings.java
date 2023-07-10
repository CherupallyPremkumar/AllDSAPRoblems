package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
      countConsistentStrings("abc",new String[]{"a","d","c","ab","ac","bc","abc"});
    }

       static public int countConsistentStrings(String allowed, String[] words) {
            int count=0;
            for(String s:words)
            {
                if(checkStringExitsinAllowed(allowed,s)) count++;
            }
            return count;
        }
       static private boolean checkStringExitsinAllowed(String allowed,String s)
        {
            boolean match=false;
            for(char c:s.toCharArray())
            {

                for (int i = 0; i < allowed.length(); i++) {
                    if (c == allowed.charAt(i)) {
                        match = true;
                        break;
                    }else
                    {
                        return false;
                    }
                }
            }
            return match;
        }
    static public int countConsistentStringss(String allowed, String[] words) {
        int count=0;
        Map<Character,Integer> a=new HashMap<>();
        for(char a1: allowed.toCharArray()) a.put(a1,1);

        for(String s:words)
        {
            boolean b=false;
            for(char c: s.toCharArray())
            {
                if(!a.containsKey(c))
                {
                    b=true;
                }
            }
            if(!b)
            count++;
        }
        return count;
    }
    }

