package com.premkumar.DSA.CodeNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {
    public static void main(String[] args) {


                  separateNegativeAndPositive(new int[]{-23, 48, -13, 31, -12, 6, -42, 23, 14, 33, -33, -21, 0 ,25, -39, -31 }) ;
    }
        public static int[] separateNegativeAndPositive(int a[]) {

            int i=0;
            int j=a.length-1;
            while(i<j)
            {
                if(a[i]>0)
                {
                    swap(i,j,a);
                    j--;
                }else
                {
                    i++;
                }
            }
            System.out.println(Arrays.toString(a));
            return a;


        }
        public static void swap(int i,int j,int[] a)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

    }


 class Solutionn {
    public static void main(String[] args) {

    }
    public static int maxGoldCollected(int[][] mine, int n, int m) {
        int max=0;
        for (int i = 0; i < n; i++) {
                 int cur=GoldMineProblem(mine, i, 0,0,0);
                 max=Math.max(max,cur);
        }
                                   return max;
    }
    public static int GoldMineProblem(int[][] mine,int row,int column,int max,int cur)
    {

      if(row<0 || row>mine.length || column>mine[0].length || column<0){ return 0;}
       return mine[row][column]+          Math.max(Math.max(GoldMineProblem(mine, row-1, column+1,max,cur), GoldMineProblem(mine, row, column+1,max,cur)) ,GoldMineProblem(mine, row+1, column+1,max,cur));

    }
}

 class Solution {
     public static void main(String[] args) {
      //   System.out.println( findFirstRepeatingDigit("74846"));
         System.out.println( minimumCost(8,"abaaaaaa",new int[]{20, 9 ,11 ,16 ,14 ,5 ,14 ,3 }));
     }
    public static int findFirstRepeatingDigit(String digitPattern) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<digitPattern.length();i++)
        {
            char aa= digitPattern.charAt(i);
            int aaa=Character.getNumericValue(aa);
            if(a.contains(aaa))
            {
                return aaa;
            }else{
                a.add(aaa);
            }
        }
        return -1;
    }
     public static int minimumCost(int n, String s, int[] cost) {
         int sum=0;
         int a=0;
         int i=1;
         int j=0;
         while (i<n)
         {
                 if(s.charAt(i)==s.charAt(j))
                 {
                     int less=findlessValue(cost,i,j);
                     sum+=cost[less];
                     j=i;
                 }
                 j++;
                 i++;
             }

         return sum;
     }
     public static int findlessValue(int[] cost,int l,int r)
     {
         return cost[l]> cost[r] ? r : l;
     }
}
