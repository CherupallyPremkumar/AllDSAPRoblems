package com.premkumar.DSA.design;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberofRecentCalls {
    class RecentCounter {
        int[] counter;
        int pointer;
        public RecentCounter() {
            counter=new int[1000000];
            pointer=0;
        }

        public int ping(int t) {
            counter[pointer]=t;
            pointer++;
            return getinclusiveRange(t);
        }
        private int getinclusiveRange(int t)
        {
            int a=t-3000;
            int count=0;
            for(int i=pointer-1;i>=0;i--)
            {
                if(counter[i]>=a)
                {
                    count++;
                }
            }
            return count;
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
class M
{
    public static void main(String[] args) {


    }
}