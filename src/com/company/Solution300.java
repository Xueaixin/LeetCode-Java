package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        for(int i = 0; i < n; i ++) {
            dp[i] = 1;
        }
        int res = dp[0];
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < i; j ++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}