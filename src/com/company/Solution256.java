package com.company;

class Solution256 {
    public int minCost(int[][] costs) {
        int n = costs.length;
        if(n == 0) {
            return 0;
        }
        int[][] dp = new int[n][3];
        for(int i = 0; i < 3; i ++) {
            dp[0][i] = costs[0][i];
        }
        for(int i = 1; i < n; i ++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }
        int res = Math.min(dp[n - 1][0], dp[n - 1][1]);
        res = Math.min(res, dp[n - 1][2]);
        return res;
    }
}
