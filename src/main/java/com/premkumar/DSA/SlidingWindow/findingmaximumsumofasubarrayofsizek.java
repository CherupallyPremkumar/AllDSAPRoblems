package com.premkumar.DSA.SlidingWindow;

public class findingmaximumsumofasubarrayofsizek {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 2, 3, 1, 10, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSumSliding(arr, n, k));
    }
   //Brute force Approch its takes O(n^2)
    private static int maxSum(int[] arr, int n, int k) {
       int sum=Integer.MIN_VALUE;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length-k+1; i++) {
            int curSum=0;
            for (int j = 0; j <k; j++) {
                curSum += arr[i+j];
            }
            sum = Math.max(sum, curSum);
        }
        return sum;
    }
    //window sliding technique
    private static int maxSumSliding(int[] arr, int n, int k) {
       int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int wsum=sum;
        for (int j=k;j<arr.length;j++)  //17 ,2-1,1,
        {
            wsum-=arr[j-k];
            wsum+=arr[j];
            sum=Math.max(sum,wsum);
        }
        return sum;
    }
}
