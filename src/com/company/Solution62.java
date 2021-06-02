package com.company;

import java.util.Arrays;

class Solution62 {

    //动态规划
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) {
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        for (int[] d : dp) {
            System.out.println(Arrays.toString(d));
        }
        return dp[m - 1][n - 1];
    }

    //数学计算
    public int uniquePaths(int m, int n, int test) {
        if(m == 1 || n == 1) {
            return 1;
        }
        return (int)(getFactorial(n,m + n - 2) / getFactorial(1,m - 1)) + test;
    }
    //求x到y(x<y)的阶乘
    public long getFactorial(int x, int y) {
        long res = 1;
        for(int i = x; i <= y; i ++) {
            res *= i;
        }
        return res;
    }
}