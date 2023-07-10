package com.premkumar.DSA.Interview;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

        public static void findPairs(int[] arr, int target) {
            // Create a map to store the complements of elements in the array
            Map<Integer, Integer> complementMap = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int complement = target - arr[i];
                if (complementMap.containsKey(complement)) {
                    int index = complementMap.get(complement);
                    System.out.println("Pair found at indices " + index + " and " + i +
                            ": (" + arr[index] + ", " + arr[i] + ")");
                }
                // Add the current element to the map with its index
                complementMap.put(arr[i], i);
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 4, 0,0,8,8, 3, 2, 7, 6};
            int target = 9;

            findPairs(arr, target);
        }
    }


