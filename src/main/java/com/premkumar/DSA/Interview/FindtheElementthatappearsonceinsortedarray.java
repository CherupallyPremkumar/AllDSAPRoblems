package com.premkumar.DSA.Interview;

public class FindtheElementthatappearsonceinsortedarray {
    public static void main(String[] args) {

        System.out.println(FindMaxSum(new int[]{}));
    }

static public void findunique(int[] a)
    {
       int XOR=0;
        for (int j : a) {
            XOR = XOR ^ j;
        }
        System.out.println(XOR);

    }
   static public int FindMaxSum(int[] arr)
    {
        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j+=2)
            {
                sum+=arr[j];
            }
            max=Math.max(max,sum);
        }
        return max;

    }
}
