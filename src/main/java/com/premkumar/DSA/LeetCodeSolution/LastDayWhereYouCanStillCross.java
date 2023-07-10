package com.premkumar.DSA.LeetCodeSolution;

public class LastDayWhereYouCanStillCross {
    public static void main(String[] args) {
        System.out.println(latestDayToCross(3,3,new int[][]{{1,2},{2,1},{3,3},{2,2},{1,1},{1,3},{2,3},{3,2},{3,1}}));
    }
        private static final int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

       static private boolean cancross(int row, int col, int[][] cells, int index){
            int[][] grid = new int[row][col];

            for (int i = 0; i < index; ++i) {
                grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
            }

            for(int i = 0;i < col;i++){
                if(dfs(grid,0,i)){
                    return true;
                }
            }

            return false;
        }

       static private boolean dfs(int[][] grid, int i, int j){
            if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 1){
                return false;
            }

            if(i == grid.length-1){
                return true;
            }

            grid[i][j] = 1;

            for(int[] dir : dirs){
                int x = i + dir[0];
                int y = j + dir[1];

                if(dfs(grid,x,y)){
                    return true;
                }
            }

            return false;
        }

       static public int latestDayToCross(int row, int col, int[][] cells) {
            int lo = 1, hi = cells.length;

            while(lo < hi){

                int mid = hi - (hi-lo) / 2;

                if(cancross(row,col,cells,mid)){
                    lo = mid;
                }
                else{
                    hi = mid-1;
                }
            }

            return lo;
        }
    }
