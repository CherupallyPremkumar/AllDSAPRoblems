package com.premkumar.DSA.LeetCodeSolution;


import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] values = { { 1,2,3,4},{5,6,7,8},{9,10,11,12 } };
        System.out.println(spiralOrder(values));
    }
        static public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> list=new ArrayList<>();
            int left=0;
            int top=0;
            int right=matrix[0].length-1;
            int bottom=matrix.length-1;
            while (top<=bottom && left<=right) {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[left][i]);
                }
                top++;
                for(int j=top;j<=bottom;j++)
                {
                    list.add(matrix[j][right]);
                }
                right--;
                for(int k=right;k>=left;k--)
                {
                    list.add(matrix[bottom][k]);
                }
                bottom--;
                for(int l=bottom;l>=top;l--)
                {
                    list.add(matrix[l][left]);
                }
                 left++;
            }
            return list;
        }

}
