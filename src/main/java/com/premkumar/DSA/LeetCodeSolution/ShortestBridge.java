package com.premkumar.DSA.LeetCodeSolution;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public static void main(String[] args) {
        shortestBridge(new int[][]{{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}});
    }
    static public int shortestBridge(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, q);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        return findNearestIsLandBFS(grid, q);
    }

    static public void dfs(int[][] grid, int i, int j, Queue<int[]> q) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1 || grid[i][j] == 0) return;
        grid[i][j] = -1;
        q.offer(new int[]{i, j});
        dfs(grid, i - 1, j, q);
        dfs(grid, i, i + 1, q);
        dfs(grid, i + 1, j, q);
        dfs(grid, i, j - 1, q);
    }

    static private int findNearestIsLandBFS(int[][] grid, Queue<int[]> q) {
        int[][] trav = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] temp = q.poll();
                for (int[] direc : trav) {
                    int i_ = temp[0] + direc[0];
                    int j_ = temp[1] + direc[1];
                    if (i_ >= grid.length || i_ < 0 || j_ >= grid[0].length || j_ < 0 || grid[i_][j_] == -1) continue;
                    if (grid[i_][j_] == 1)
                        return level;
                    else {
                        grid[i_][j_] = -1;
                        q.offer(new int[]{i_, j_});
                    }
                }
            }
            level += 1;
        }
        return -1;
    }
}

