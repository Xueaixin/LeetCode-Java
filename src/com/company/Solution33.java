package com.company;

public class Solution33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(target == nums[0]) {
            return 0;
        }
        if(target == nums[n - 1]) {
            return n - 1;
        }
        return search(nums, 0, n - 1, target);
    }
     public int search(int[] nums, int start, int end, int target) {
         System.out.println(start + "<----->" + end);
         if(start >= end) {
             return -1;
         }
         int mid = (start + end) / 2;
         System.out.println(nums[mid]);
         if(target == nums[mid]) {
             return mid;
         }
         if(target < nums[mid]) {
             if(nums[mid] <= nums[start] || target >= nums[start]) {
                 return search(nums, start, mid, target);
             }
             else {
                 return search(nums, mid, end, target);
             }
         }
         else {
             if(nums[mid] >= nums[start] || target <= nums[end]) {
                 return search(nums, mid + 1, end, target);
             }
             else {
                 return search(nums, start, mid, target);
             }
         }
     }
}
