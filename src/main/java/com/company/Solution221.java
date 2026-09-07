package com.company;

public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                if(matrix[i][j] == '0') {
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                }
                else {
                    int t = Math.min(dp[i - 1][j - 1], dp[i][j - 1]);
                    dp[i][j] = Math.min(t, dp[i - 1][j]) + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res * res;
    }
}
