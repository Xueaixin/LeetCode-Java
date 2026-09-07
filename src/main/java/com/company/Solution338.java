package com.company;

public class Solution338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        int k = 1;
        for(int i = 1; i < num + 1; i ++) {
            if(i == k * 2) {
                k = i;
            }
            res[i] = res[i - k] + 1;
        }
        return res;
    }
}
