package com.premkumar.DSA.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFSonw2dGrid {
    static int[] dRow = { -1, 0, 1, 0 ,1 };
    static int[] dCol = { 0, 1, 0, -1 ,1 };

    static class Pair{
        int row, col,count;
        Pair(int row,int col,int count)
        {
            this.row=row;
            this.col=col;
            this.count=count;
        }
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 0},
                { 1, 1, 0 },
                { 1, 1, 0 }};

        // Declare the visited array
        boolean [][]vis = new boolean[grid.length][grid[0].length];

        System.out.println( BFS(grid, vis, 0, 0));
    }

    private static int BFS(int[][] grid, boolean[][] vis, int row, int col) {
        Queue<Pair> queue=new LinkedList<>();
        if(!vis[row][col])
        {
            queue.add(new Pair(row,col,1));
            vis[row][col]=true;
            System.out.println(row +" "+col);
        }

        while(!queue.isEmpty())
        {
            Pair pair= queue.peek();
           int acol= pair.col;
           int arow= pair.row;
           int column=pair.count;

            if (acol == grid.length-1 && arow == grid.length) {

            }
            queue.remove();
            for (int i = 0; i < 4; i++) {
                int bcol=acol+dCol[i];
                int brow=arow+dRow[i];
                if(isValid(vis,grid,brow,bcol))
                {
                    queue.add(new Pair(brow,bcol,column++));
                    vis[brow][bcol]=true;
                }
            }
        }
        return -1;
    }

    private static boolean isValid(boolean[][] vis,int[][] grid, int brow, int bcol) {
        if(brow<0 || bcol<0 || brow>=grid.length || bcol>=grid[0].length || grid[brow][bcol]==1)
        {
            return false;
        }
        return !vis[brow][bcol];

    }


}

