package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRoworColumn {
    public static void main(String[] args) {
        System.out.println(firstCompleteIndex(new int[]{2,8,7,4,1,3,5,6,9},new int[][]{{3,2,5},{1,4,6},{8,7,9}}));
    }

        public static int firstCompleteIndex(int[] arr, int[][] mat) {

            Map<Integer,int[]> integerMap=new HashMap<>();
            Map<String,Integer> integer=new HashMap<>();
            for (int i = 0; i <mat.length ; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                   integerMap.put(mat[i][j],new int[]{i,j});
                   integer.put("r"+i,mat[0].length-1);
                   integer.put("c"+j,mat.length-1);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(integerMap.containsKey(arr[i]))
                {
                    int[] a=integerMap.get(arr[i]);
                    if(integer.get("r"+a[0])!=0 && integer.get("c"+a[1])!=0)
                    {
                        System.out.println(integer.get("r" + a[0])+""+integer.get("c" + a[1]));
                        integer.put("r" + a[0], integer.get("r" + a[0])-1) ;
                        integer.put("c" + a[1], integer.get("c" + a[1])-1);
                    }else
                    {
                        return i;
                    }
                }
            }
//            System.out.println(integer);
//            System.out.println(integerMap);
//            integerMap.values().forEach(q-> System.out.println(Arrays.toString(q)));
         return 1;
        }
    }
