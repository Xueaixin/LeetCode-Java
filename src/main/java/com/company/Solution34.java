package com.company;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int n = nums.length;
        if(n == 0) {
            return res;
        }
        int mid = (0 + n) / 2;
        searchRange(0, n - 1, nums, target, res);
        return res;
    }
    public void searchRange(int start, int end, int[] nums, int target, int[] res) {
        if(start > end) {
            return;
        }
        int mid = (start + end) / 2;
        if(target == nums[mid]) {
            if(res[0] == -1 || res[0] > mid) {
                res[0] = mid;
            }
            if(res[1] == -1 || res[1] < mid) {
                res[1] = mid;
            }
            searchRange(start, mid - 1, nums, target, res);
            searchRange(mid + 1, end, nums, target, res);
        }
        if(target < nums[mid] && res[1] == -1) {
            searchRange(start, mid - 1, nums, target, res);
        }
        if(target > nums[mid]) {
            searchRange(mid + 1, end, nums, target, res);
        }
    }
}
