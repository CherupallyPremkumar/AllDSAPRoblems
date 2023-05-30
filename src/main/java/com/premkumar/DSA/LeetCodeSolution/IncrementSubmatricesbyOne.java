package com.premkumar.DSA.LeetCodeSolution;


public class IncrementSubmatricesbyOne {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for (int[] query : queries) {
            int row1 = query[0];
            int col1 = query[1];
            int row2 = query[2];
            int col2 = query[3];
            rangeAddQueries(n, row1, col1, row2, col2, mat);
        }
        return mat;
    }

    public void rangeAddQueries(int n, int row1, int col1, int row2, int col2, int[][] mat) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                mat[i][j] += 1;
            }
        }
    }
}

