package com.company;

import java.util.Arrays;

class Solution416 {
    public boolean canPartition(int[] nums) {

        int n = nums.length;
        if(n < 1) {
            return false;
        }
        int sum = 0;
        int maxNum = 0;
        for(int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        int target = sum / 2;
        if(sum % 2 != 0 || maxNum > target) {
            return false;
        }
        boolean[][] f = new boolean[n][target + 1];
        for(int i = 0; i < n; i ++) {
            f[i][0] = true;
        }
        for(int i = 1; i < n; i ++) {
            for(int j = 1; j <= target; j ++) {
                if(j < nums[i]) {
                    f[i][j] = f[i - 1][j];
                }
                else {
                    f[i][j] = f[i - 1][j] || f[i - 1][j - nums[i]];
                }
            }
        }
        return f[n - 1][target];
    }
    public boolean canPartition(int[] nums, int test) {

        int n = nums.length;

        if(n < 1) {
            return false;
        }
        int sum = 0;
        int maxNum = 0;
        for(int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        int target = sum / 2;
        if(sum % 2 != 0 || maxNum > target) {
            return false;
        }
        int[][] f = new int[n + 1][target + 1];
        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= target; j ++) {
                if(j < nums[i - 1]) {
                    f[i][j] = f[i - 1][j];
                }
                else {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - nums[i - 1]] + nums[i - 1]);
                }
            }
        }
        return f[n][target] == target;
    }
}