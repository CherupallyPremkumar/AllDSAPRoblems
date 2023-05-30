package com.premkumar.DSA.LeetCodeSolution;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Element {
    int value;
    int count;
    Element(int value, int count) {
        this.value = value;
        this.count = count;
    }
}

public class TopKFrequentElements {
   /* public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> h = new HashMap<>();
        List<Element> a = new ArrayList<>();
        int[] arr = new int[k];
        for (int num : nums) {
            if (h.containsKey(num)) h.put(num, h.get(num) + 1);
            else h.put(num, 1);
        }
        for (Integer i : h.keySet()) a.add( new Element(i, h.get(i)));
        a.sort((e1, e2) -> e2.count - e1.count);
        for (int j = 0; j < k; j++) arr[j] = a.get(j).value;
        return arr;
    }*/
   public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Element> h = new HashMap<>();
       int[] arr = new int[k];
       for (int num : nums) {
           if (h.containsKey(num)) {
               Element element = h.get(num);
               element.count++;
               h.put(num, element);
           } else h.put(num, new Element(num,1));
       }
       AtomicInteger i= new AtomicInteger();
       h.values().stream().sorted((a, b)->b.count-a.count).forEach(a->arr[i.getAndIncrement()]=a.value);
       return arr;
   }
}