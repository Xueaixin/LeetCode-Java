package com.company;

import java.util.Arrays;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1; i < amount + 1; i ++) {
            int tem = Integer.MAX_VALUE;
            for(int j = 0; j < n && i >= coins[j]; j ++){
                if(tem > dp[i - coins[j]] && dp[i - coins[j]] != -1){
                    System.out.println(tem + "<--->" + dp[i - coins[j]]);
                    tem = dp[i - coins[j]];
                }
            }
            if (tem != Integer.MAX_VALUE){
                dp[i] = tem + 1;
            }
            else {
                dp[i] = -1;
            }
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}
