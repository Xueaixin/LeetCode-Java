package com.company;

public class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i < n + 1; i ++) {
            int j = 1;
            int tem = dp[i - 1];
            while(j * j <= i) {
                if(tem > dp[i - j * j]){
                    tem = dp[i - j * j];
                }
                j ++;
            }
            dp[i] = tem + 1;
        }
        return dp[n];
    }
}
