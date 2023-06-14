package com.premkumar.DSA.LeetCodeSolution;

import java.util.HashMap;

public class MaximumValueataGivenIndexinaBoundedArray {
    public static void main(String[] args) {
        System.out.println(maxValue(6,1,10));
    }
      static   public int maxValue(int n, int index, int maxSum) {
            for(int i=3;i>0;i--){
                int[] arr=new int[n];
                arr[index]=i;
                binarysearch(arr,index,index,index,maxSum-i);
                if(checkarray(arr,maxSum)) return i;
            }
            return 1;
        }
       static public boolean checkarray(int[] arr,int maxSum)
        {
            int sum=0;
            HashMap<String,Integer> stringIntegerHashMap=new HashMap<>();
            stringIntegerHashMap.values().stream().sorted().findFirst();
            for(int i=1;i<arr.length;i++)
            {
                sum+=arr[i];
                if(arr[i]==0) return false;
                if(Math.abs(arr[i-1]-arr[i]) !=1)
                {
                    return false;
                }
            }
            return arr[0] + sum == maxSum;

        }
      static   public int[] binarysearch(int[] arr,int index,int left , int right, int maxsum)
        {
            if(left<0 && right> arr.length) return arr;
            if(index==left && index ==right)
            {
                binarysearch(arr,index,left-1,right+1,maxsum);
            }
            if(left>=0)
            {
                if(arr[left+1]!=0 && arr[left+1]-1<=maxsum)
                {
                    arr[left]=arr[left+1]-1;
                    maxsum=maxsum-arr[left]-1;
                }
            }
            if(right<arr.length)
            {
                if(arr[right-1]!=0 && arr[right-1]-1<=maxsum)
                {
                    arr[right]=arr[right-1]-1;
                    maxsum=maxsum-arr[right]-1;
                }
            }
            return binarysearch(arr,index,left-1,right+1,maxsum);
        }
    }

