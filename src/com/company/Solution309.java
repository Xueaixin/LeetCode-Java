package com.company;

public class Solution309 {

    public static void main(String[] args) {
        Solution309 s = new Solution309();
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(s.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1) {
            return 0;
        }
        int[][] f = new int[n][3];

        /*第i天结束后的状态：
            f[i][0]--手中持有股票的最大收益
            f[i][1]--卖出手中股票，进入冷冻期，手中无股票
            f[i][2]--冷冻期结束，手中无股票
         */
        f[0][0] = -prices[0];
        for(int i = 1; i < n; i ++) {
            f[i][0] = Math.max(f[i - 1][2] - prices[i], f[i - 1][0]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}
