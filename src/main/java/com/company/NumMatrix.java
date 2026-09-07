package com.company;

import java.util.Arrays;

public class NumMatrix {
    private final int[][] sums;
    public NumMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            sums = null;
        }
        else {
            int m = matrix.length;
            int n = matrix[0].length;
            sums = new int[m][n];
            for(int i = 0; i < m; i ++) {
                for(int j = 0; j < n; j ++) {
                    if(i == 0 && j == 0) {
                        sums[i][j] = matrix[i][j];
                    }
                    else if(i == 0) {
                        sums[i][j] = sums[i][j - 1] + matrix[i][j];
                    }
                    else if(j == 0) {
                        sums[i][j] = sums[i - 1][j]+ matrix[i][j];
                    }
                    else {
                        sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + matrix[i][j];
                    }
                }
            }
            System.out.println("matrix为:");
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println("sums为:");
            for(int i = 0; i < m; i ++) {
                System.out.println(Arrays.toString(sums[i]));
            }
//            System.out.println(Arrays.deepToString(sums));
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(sums == null) {
            return 0;
        }
        if (row1 == 0 && col1 == 0) {
            return sums[row2][col2];
        }
        if(row1 == 0) {
            return sums[row2][col2] - sums[row2][col1 - 1];
        }
        if(col1 == 0) {
            return sums[row2][col2] - sums[row1 - 1][col2];
        }
        return sums[row2][col2] - sums[row2][col1 - 1] - sums[row1 - 1][col2] + sums[row1 - 1][col1 - 1];
    }
}
