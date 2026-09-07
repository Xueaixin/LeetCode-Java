package com.company;

public class Solution698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int maxNum = 0;
        for(int num : nums) {
            sum += num;
            maxNum = Math.max(num, maxNum);
        }
        int target = sum / k;
        if(sum % k != 0 || target < maxNum) {
            return false;
        }

        return true;
    }
}
