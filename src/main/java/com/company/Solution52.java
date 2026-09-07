package com.company;

import java.util.Arrays;

public class Solution52 {
    public int totalNQueens(int n) {
        boolean[][] sites = new boolean[3][n * 2 - 1];
//        System.out.println(Arrays.deepToString(sites));
        return totalNQueens(0, sites, n);
    }
    public int totalNQueens(int i, boolean[][] sites, int n) {
        if(i == n) {
            printsites(sites);
            return 1;
        }
        int res = 0;
        for(int j = 0; j < n; j ++) {
            if(isAllowed(sites, n, i, j)) {
                sites[0][j] = true;
                sites[1][i + j] = true;
                sites[2][i - j + n - 1] = true;
                res += totalNQueens(i + 1, sites, n);
                sites[0][j] = false;
                sites[1][i + j] = false;
                sites[2][i - j + n - 1] = false;
            }
        }
        return res;
    }
    public boolean isAllowed(boolean[][] sites, int n, int i, int j) {
        if(sites[0][j]) {
            return false;
        }
        if(sites[1][i + j]) {
            return false;
        }
        if(sites[2][i - j + n - 1]) {
            return false;
        }
        return true;
    }
    public void printsites(boolean[][] sites) {
        System.out.println("-------------sites数组为------------");
        for(int i = 0; i < 3; i ++) {
            System.out.println(Arrays.toString(sites[i]));
        }
    }
}
