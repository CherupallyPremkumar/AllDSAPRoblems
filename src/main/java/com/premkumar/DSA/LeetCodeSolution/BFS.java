package com.premkumar.DSA.LeetCodeSolution;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args)
    {

        // Given input matrix
        int grid[][] = { { 0, 0, 0, 1 },
                         { 1, 1, 0, 0 },
                         { 1, 1, 0, 0 },
                         { 0, 1, 1, 1 } };

        // Declare the visited array
        boolean [][]vis = new boolean[grid.length][grid[0].length];

        BFS(grid, vis, 0, 0);
    }
    static void BFS(int[][] grid, boolean[][] vis,int row,int col)
    {
         int dRow[] = { -1, 0, 1, 0 };
         int dCol[] = { 0, 1, 0, -1 };
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{row,col});
        vis[row][col]=true;
        while (!q.isEmpty())
        {
            int[] sem=q.peek();
            q.remove();
            for (int i = 0; i < grid.length; i++) {
//                if(isValid(vis,sem[0]+dRow[i],sem[0]+dCol[i]))
//                {
//
//                }

            }
        }
    }

//    private static boolean isValid(boolean[][] vis, int i, int i1) {
//    }

}
