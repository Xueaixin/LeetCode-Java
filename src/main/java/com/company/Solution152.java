package com.company;

public class Solution152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        int[] min = new int[n];
        dp[0] = min[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i ++) {
            int t1 = dp[i - 1] * nums[i];
            int t2 = min[i - 1] * nums[i];
            dp[i] = Math.max(nums[i], t1);
            dp[i] = Math.max(dp[i], t2);
            min[i] = Math.min(nums[i], t1);
            min[i] = Math.min(min[i], t2);
            if(dp[i] > res) {
                res = dp[i];
            }
        }
        return res;
    }
}
