package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

public class Main {

    public static void do746() {
        //#746，每次1or2步，最小花费爬楼梯
        Solution746 s746 = new Solution746();
        int[] nums = {0, 0, 1, 0};
        System.out.println(s746.minCostClimbingStairs(nums));
    }

    public static void do96() {
        //1~n为节点生成的所有二叉搜索树。
        Solution96 s96 = new Solution96();
        for(TreeNode root: s96.generateTrees(3)) {
            OperateTree operateTree = new OperateTree();
            operateTree.printTree(root);
            System.out.println();
        }
    }

    public static void do221() {
        //最大正方形
        Solution221 s221 = new Solution221();
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(s221.maximalSquare(matrix));
    }

    public static void do416() {
        Solution416 solution416 = new Solution416();
        int[] nums = {1, 5, 11, 5};
        System.out.println(solution416.canPartition(nums, 1));
    }

    public static  void do300() {
        int[] nums = {1,3,6,7,9,4,10,5,6};
//        int[] nums = {4,10,4,3,8,9};
//        int[] nums = {10,9,2,5,3,7,101,18};
        Solution300 solution300 = new Solution300();
        System.out.println(solution300.lengthOfLIS(nums));
    }
    public static  void do62() {
        Solution62 solution = new Solution62();
        int m = 10;
        int n = 10;
        System.out.println(solution.uniquePaths(m, n));
        System.out.println(solution.uniquePaths(m, n, 0));
    }
    public static void do139() {
        String s = "leetcode";
        String[] list = {"leet", "code"};
        List<String> wordDict = new ArrayList<String>(Arrays.asList(list));
        Solution139 solution = new Solution139();
        System.out.println(solution.wordBreak(s, wordDict));
    }
    public static void do152() {
        Solution152 solution = new Solution152();
        int[] nums = {-2,3,-4};
        System.out.println(solution.maxProduct(nums));
    }
    public static void do1002() {
        Solution1002 solution = new Solution1002();
        String[] A = {"cool","lock","cook"};
        System.out.println(solution.commonChars(A));
    }
    public static void do256(){
        Solution256 solution = new Solution256();
        int[][] costs = {{17,2,17},{16,16,5},{14,3,19}};
        int[][] c = {{13,8,17},{6,8,19},{5,1,7},{5,18,2},{12,3,4},{12,7,10},{14,16,7},{19,17,19}};
        System.out.println(solution.minCost(c));
    }
    public static void do279() {
        Solution279 solution = new Solution279();
        int n = 13;
        System.out.println(solution.numSquares(n));
    }
    public static void do304() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix m = new NumMatrix(matrix);
        System.out.println(m.sumRegion(2, 1, 4, 3));
        System.out.println(m.sumRegion(1, 1, 2, 2));
        System.out.println(m.sumRegion(1, 2, 2, 4));
    }
    public static void do322() {
        Solution322 solution = new Solution322();
        int[] coins = {1, 2};
        int amount = 3;
        System.out.println(solution.coinChange(coins, amount));
    }
    public static void do338() {
        Solution338 solution = new Solution338();
        System.out.println(Arrays.toString(solution.countBits(5)));
        System.out.println(Arrays.toString(solution.countBits(12)));
    }
    public static void do52() {
        Solution52 solution = new Solution52();
        System.out.println(solution.totalNQueens(4));
    }
    public static void do33() {
        Solution33 solution = new Solution33();
        int[] nums = {1,2,3,4,5,6};
//        int[] nums = {1,3};
//        int[] nums = {4,5,6,7,0,1,2};
//        System.out.println(solution.search(nums, 3));
//        System.out.println(solution.search(nums, 0));
//        System.out.println(solution.search(nums, 2));
        System.out.println(solution.search(nums, 4));
    }
    /*
    public static void do() {
        Solution solution = new Solution();
        System.out.println();
    }
     */
    public static void main(String[] args) {
//        do221();
//        do416();
//        do300();
//        do62();
//        do139();
//        do152();
//        do1002();
//        do256();
//        do279();
//        do304();
//        do322();
//        do338();
//        do52();
//        do33();
//        int[] re = {1,1};
//        re[1] = 4;
//        System.out.println(Arrays.toString(re));
        List<Integer> res = new ArrayList();
        res.add(0, 15);
        System.out.println(res);
    }
}
