package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;

public class KthLargestElementinaStream {
    public static void main(String[] args) {
        KthLargestElementinaStream k= new KthLargestElementinaStream(3,new int[]{4,5,8,2});
        System.out.println( k.add(3));
        System.out.println( k.add(5));
        System.out.println( k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }

        int[] stream;
        int size;
        int returnIndex;
        private int[] dummy;

        public KthLargestElementinaStream(int k, int[] nums) {
            this.stream=nums;
            this.returnIndex=k;
            this.size=nums.length;
        }

        public int add(int val) {
            size++;
            dummy=new int[size];
            System.arraycopy(stream, 0, dummy, 0, size-1);
            dummy[size-1]=val;
            stream=dummy;
            return KthLargestNumber(stream);
        }
        private int KthLargestNumber(int[] stream)
        {
            Arrays.sort(stream);
            return stream[size-returnIndex];
        }
    }

