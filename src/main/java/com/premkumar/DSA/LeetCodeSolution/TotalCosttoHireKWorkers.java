package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TotalCosttoHireKWorkers {
    public static void main(String[] args) {
        System.out.println(totalCosts(new int[]{31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58}, 11, 2));
    }



    static public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        for (int i = 0; i < costs.length; i++) {
            if ((costs.length / 2) > i) p.add(costs[i]);
            else p2.add(costs[i]);
        }
        long sum = 0;
        while (k > 0) {
            if (p.peek().equals(p2.peek())) {
                sum += p.poll();
            } else if (p.peek() < p2.peek()) {
                sum += p.poll();
            } else if (p.peek() > p2.peek()) {
                sum += p2.poll();
            }
            k--;
        }
        return sum;
    }

    static public long totalCosts(int[] costs, int k, int candidates) {

        int left = 0, right = costs.length - 1, l = candidates;
        long sum = 0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        while (l > 0 && left < right) {
            p.add(costs[left++]);
            p2.add(costs[right--]);
            l--;
        }
        while (k > 0 && left <= right) {
            p.add(costs[left]);
            p2.add(costs[right]);
            if (p.peek() == p2.peek()) {
                sum += p.poll();
                left++;
            } else if (p.peek() < p2.peek()) {
                sum += p.poll();
                left++;
            } else if (p.peek() > p2.peek()) {
                sum += p2.poll();
                right--;
            }
            k--;
        }
        return sum;
    }
}

