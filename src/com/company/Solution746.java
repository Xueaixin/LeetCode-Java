package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 2) {
            return Math.min(cost[0], cost[1]);
        }
        boolean[] step = new boolean[n];
        int first = cost[0];
        int second = cost[1];
        int res;
        if(cost[0] > cost[1]) {
            step[1] = true;
            res = cost[1];
        }
        else {
            step[0] = true;
            res = cost[0];
        }
        for(int i = 2; i < n; i ++) {
            int t = res;
            if(!step[i - 1]) {
                if(first + cost[i] > second) {
                    step[i - 2] = false;
                    step[i - 1] = true;
                    res = second;
                }
                else {
                    step[i] = true;
                    res += cost[i];
                }
            }
            else {
                if(first + cost[i] < second) {
                    step[i - 2] = true;
                    step[i - 1] = false;
                    step[i] = true;
                    res += cost[i];
                }
            }
            first = second;
            second = t + cost[i];
            System.out.println(Arrays.toString(step));
        }
        return res;
    }
}
