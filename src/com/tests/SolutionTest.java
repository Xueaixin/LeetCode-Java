package com.tests;

import com.objects.Solution;
import com.objects.utils.ListNode;
import com.objects.utils.OperateList;
import com.objects.utils.OperateTree;
import com.objects.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void demo() {
        int a = 4;
        int b = 4;
        System.out.println(0b1000);
        System.out.println(0b0100);
        System.out.println(0b0010);
        System.out.println(0b0001);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println("\\".length());
//        OperateTree operateTree = new OperateTree();
//        TreeNode root = operateTree.restoreTree(new Integer[]{1, null, 2, 2});
////        ArrayList<Integer> res = new ArrayList<>();
////        operateTree.inorderTraversal(res, root);
//        System.out.println(Arrays.toString(solution.findMode(root)));
    }

    @Test
    void decodeMessage() {
//        String key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(solution.decodeMessage(key, message));
    }

    @Test
    void strongPasswordCheckerII() {
//        String password = "IloveLe3tcode!";
        String password = "Me+You--IsMyDream";
        System.out.println(solution.strongPasswordCheckerII(password));
    }

    @Test
    void countNicePairs() {
//        int[] nums = new int[]{42, 11, 1, 97};
        int[] nums = new int[]{13, 10, 35, 24, 76};
        System.out.println(solution.countNicePairs(nums));
    }

    @Test
    void regionsBySlashes() {
//        String[] s = new String[]{" /", "/ "};
//        String[] s = new String[]{"    ", " /\\ ", " \\/ ", "    "};
        String[] s = new String[]{"/\\", "\\/"};
        System.out.println(solution.regionsBySlashes(s));
    }

    @Test
    void rearrangeCharacters() {
        System.out.println(solution.rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    @Test
    void findMode() {
        OperateTree operateTree = new OperateTree();
//        TreeNode root = operateTree.restoreTree(new Integer[]{1, null, 2, 2});
        TreeNode root = operateTree.restoreTree(new Integer[]{0});
        System.out.println(Arrays.toString(solution.findMode(root)));
    }

    @Test
    void countEven() {
        System.out.println(solution.countEven(30));
    }

    @Test
    void reverse() {
        System.out.println(solution.reverse(-2147483648));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    void countConsistentStrings() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(solution.countConsistentStrings(allowed, words));
    }

    @Test
    void canPlaceFlowers() {
        int[] flowerbed = {0, 0, 1, 0, 1};
        int n = 1;
        System.out.println(Arrays.toString(flowerbed));
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void eraseOverlapIntervals() {
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        int[][] intervals3 = {{1, 2}, {2, 3}};
        assertEquals(1, solution.eraseOverlapIntervals(intervals1));
        assertEquals(2, solution.eraseOverlapIntervals(intervals2));
        assertEquals(0, solution.eraseOverlapIntervals(intervals3));
    }

    @Test
    void addToArrayForm() {
        Integer[] array1 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] A1 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        assertEquals(Arrays.asList(array1), solution.addToArrayForm(A1, 1));
    }

    @Test
    void partition() {
        String s = "aab";
//        solution.partition(s);
        System.out.println(solution.partition(s));
//        System.out.println(solution.partition("a"));
    }

    @Test
    void minCut() {
        String s = "aab";
        System.out.println(solution.minCut(s));
    }

    @Test
    void calculate() {
        String s = " 3+5 / 2 ";
        System.out.println(solution.calculate(s));
    }

    @Test
    void calculateString() {
//        System.out.println(solution.calculateString("-2+ 1"));
        System.out.println(solution.calculateString("(7)-(0)+(4)"));
//        System.out.println(solution.calculateString("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    void isValidSerialization() {
//        String[] strArr = s.split(",");
//        System.out.println(Arrays.toString(strArr));
        System.out.println(solution.isValidSerialization2("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        System.out.println(solution.isValidSerialization2("9,#,#,1"));
        System.out.println(solution.isValidSerialization2("1,#"));
    }

    @Test
    void spiralOrder() {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}, {11, 12}};
        System.out.println(solution.spiralOrder(matrix));
//        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}, {25, 26, 27, 28}, {29, 30, 31, 32}};
//        System.out.println(solution.spiralOrder(matrix1));
//        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13,14,15}};
//        System.out.println("matrix2 = " + solution.spiralOrder(matrix2));
//        int[][] matrix3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
//        System.out.println("matrix2 = " + solution.spiralOrder(matrix3));
    }

    @Test
    void numDistinct() {
//        System.out.println(solution.numDistinct("babgbag", "bag"));
//        String s = "rabbbit", t = "rabbit";
        String s1 = "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc";
        String t1 = "bcddceeeebecbc";
        System.out.println(solution.numDistinct(s1, t1));

    }

    @Test
    void setZeroes() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    @Test
    void hammingWeight() {
        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
    }

    @Test
    void nthUglyNumber() {
        System.out.println(solution.nthUglyNumber(10));
        System.out.println(solution.nthUglyNumber(12));
        System.out.println(solution.nthUglyNumber(1000));
    }

    @Test
    void largestNumber() {
//        int[] nums = {3, 30, 34, 5, 9};
        int[] nums = {0, 0};
        System.out.println(solution.largestNumber(nums));
    }

    @Test
    void checkSubarraySum() {
        int[] nums = {5, 0, 0, 0};
//        int[] nums1 = {5, 6, 2, 5, 7, 0, 7, 4, 1, 6, 9, 5, 0, 8, 2, 1, 2, 0, 9, 8, 1, 7, 8, 5, 2, 0, 1, 8, 4, 4, 3, 9, 6, 9, 2, 1, 3, 6, 3, 2, 0, 9, 6, 0, 4, 0, 8, 5, 2, 9, 0, 5, 1, 3, 7, 3, 7, 3, 8, 0, 3, 5, 1, 2, 8, 4, 2, 1, 6, 8, 7, 1, 0, 5, 7, 4, 0, 7, 5, 8, 0, 9, 9, 8, 5, 7, 6, 0, 3, 8, 1, 8, 1, 6, 9, 4, 7, 9, 5, 9, 1, 6, 3, 8, 4, 2, 5, 3, 4, 3, 6, 1, 8, 2, 3, 4, 7, 1, 8, 5, 6, 1, 4, 1, 8, 1, 0, 4, 3, 1, 7, 8, 3, 5, 8, 8, 7, 6, 5, 3, 1, 9, 9, 4, 1, 3, 7, 6, 8, 1, 3, 2, 6, 4, 5, 1, 6, 5, 3, 7, 7, 2, 1, 0, 1, 9, 5, 4, 5, 1, 7, 9, 2, 6, 2, 1, 0, 1, 2, 8, 2, 1, 8, 4, 5, 1, 7, 8, 6, 7, 2, 9, 9, 1, 9, 3, 1, 5, 2, 0, 7, 2, 3, 1, 3, 2, 3, 4, 6, 6, 3, 6, 7, 2, 6, 4, 5, 8, 6, 8, 1, 3, 5, 9, 7, 5, 6, 8, 8, 8, 3, 0, 8, 9, 2, 5, 6, 4, 5, 3, 3, 3, 3, 6, 6, 6, 7, 3, 4, 8, 9, 9, 4, 7, 2, 7, 7, 8, 2, 7, 6, 3, 5, 5, 2, 2, 1, 5, 3, 1, 3, 1, 3, 9, 4, 0, 8, 1, 2, 2, 9, 1, 9, 6, 5, 1, 3, 4, 3, 4, 7, 1, 7, 7, 2, 2, 1, 5, 6, 9, 7, 8, 7, 4, 3, 8, 7, 6, 5, 3, 9, 3, 2, 1, 4, 0, 8, 2, 9, 7, 3, 3, 7, 5, 1, 7, 0, 9, 2, 1, 4, 6, 1, 2, 7, 5, 8, 7, 1, 7, 1, 2, 9, 4, 2, 8, 3, 4, 0, 0, 0, 4, 7, 7, 9, 4, 5, 7, 0, 3, 1, 0, 1, 7, 8, 8, 2, 9, 7, 3, 6, 0, 1, 1, 9, 2, 2, 1, 1, 0, 1, 6, 8, 4, 0, 7, 8, 8, 4, 2, 6, 8, 4, 4, 6, 1, 7, 0, 7, 3, 5, 7, 7, 3, 8, 5, 8, 6, 8, 8, 4, 2, 8, 5, 5, 9, 3, 3, 3, 9, 5, 0, 7, 6, 2, 5, 2, 9, 5, 4, 0, 1, 5, 9, 6, 3, 6, 7, 4, 5, 2, 6, 8, 4, 9, 2, 3, 2, 7, 4, 0, 4, 2, 5, 9, 6, 9, 1, 4, 8, 1, 9, 5, 5, 9, 0, 4, 5, 8, 4, 0, 2, 5, 5, 8, 9, 4, 3, 0, 2, 9, 8, 3, 9, 8, 5, 4, 6, 5, 6, 7, 5, 9, 0, 3, 2, 4, 3, 1, 0, 3, 2, 0, 6, 4, 7, 0, 3, 3, 9, 4, 4, 4, 4, 2, 6, 6, 5, 9, 4, 1, 7, 3, 3, 5, 0, 7, 2, 2, 7, 6, 6, 6, 7, 6, 4, 9, 4, 5, 3, 1, 7, 9, 6, 1, 8, 3, 7, 4, 0, 4, 0, 7, 4, 4, 2, 1, 2, 6, 6, 7, 8, 9, 4, 6, 8, 8, 3, 7, 7, 8, 2, 2, 3, 7, 2, 1, 7, 8, 0, 5, 6, 2, 5, 1, 5, 5, 0, 6, 7, 8, 5, 2, 2, 7, 7, 4, 3, 5, 6, 3, 8, 0, 1, 8, 6, 0, 2, 2, 7, 5, 4, 0, 8, 7, 1, 8, 3, 8, 5, 1, 8, 6, 4, 3, 9, 1, 0, 9, 2, 7, 3, 3, 8, 5, 4, 1, 8, 7, 9, 3, 8, 2, 9, 7, 0, 4, 6, 9, 5, 8, 0, 4, 9, 9, 9, 5, 7, 0, 5, 5, 6, 4, 1, 2, 1, 8, 0, 7, 8, 7, 5, 3, 1, 8, 4, 1, 4, 3, 3, 8, 2, 7, 4, 6, 6, 1, 0, 8, 4, 4, 6, 6, 8, 0, 7, 8, 7, 5, 6, 9, 8, 4, 4, 0, 1, 8, 1, 3, 5, 4, 6, 3, 1, 3, 8, 7, 8, 5, 6, 9, 4, 3, 6, 1, 9, 6, 7, 3, 8, 4, 7, 4, 6, 1, 4, 8, 6, 1, 8, 7, 3, 2, 9, 5, 3, 5, 7, 5, 7, 7, 6, 3, 0, 0, 8, 9, 9, 9, 8, 1, 8, 2, 1, 9, 2, 1, 8, 3, 9, 4, 8, 3, 7, 0, 0, 5, 4, 9, 4, 4, 8, 0, 5, 4, 1, 1, 2, 1, 7, 6, 9, 2, 6, 0, 1, 9, 5, 3, 4, 4, 3, 6, 6, 3, 8, 5, 6, 0, 9, 2, 4, 9, 3, 6, 1, 7, 8, 0, 8, 3, 3, 4, 7, 4, 2, 6, 8, 0, 3, 4, 1, 4, 5, 2, 1, 4, 7, 6, 7, 0, 7, 7, 6, 9, 6, 3, 4, 9, 7, 5, 6, 9, 3, 9, 6, 1, 1, 1, 2, 5, 7, 6, 0, 1, 7, 0, 8, 8, 2, 5, 2, 1, 8, 3, 0, 2, 9, 4, 8, 1, 5, 2, 8, 2, 4, 5, 4, 2, 1, 8, 5, 5, 0, 6, 8, 6, 7, 5, 3, 4, 7, 9, 6, 7, 3, 2, 4, 1, 3, 5, 4, 0, 4, 9, 5, 6, 7, 4, 2, 6, 6, 8, 0, 7, 1, 5, 1, 3, 8, 8, 9, 5, 0, 2, 7, 3, 5, 4, 8, 1, 6, 6, 2, 4, 0, 2, 7, 8, 5, 3, 2, 4, 6, 2, 6, 6, 1, 8, 6, 2, 4, 8, 8, 9, 6, 4, 8, 1, 5, 2, 3, 7, 5, 1, 6, 6, 8, 8, 5, 2, 9, 7, 4, 8, 2, 3, 3, 8, 3, 1, 7, 9, 4, 2, 3, 7, 8, 2, 9, 9, 6, 6, 2, 4, 5, 5, 0, 4, 9, 4, 7, 1, 5, 3, 2, 9, 3, 1, 8, 3, 3, 2, 5, 3, 4, 2, 6, 8, 3, 8, 0, 6, 0, 7, 2, 9, 3, 9, 2, 3, 9, 6, 0, 7, 8, 6, 1, 4, 6, 7, 5, 9, 4, 7, 4, 7, 6, 6, 0, 8, 9, 3, 8, 1, 4, 7, 3, 9, 7, 1, 4, 8, 4, 1, 3, 7, 8, 2, 6, 6, 9, 8, 8, 2, 7, 8, 2, 1, 7, 4, 1, 4, 5, 9, 6, 4, 2, 3, 7, 7, 0, 1, 8, 9, 2, 8, 6, 1, 6, 6, 0, 6, 1, 5, 5, 0, 9, 8, 9, 4, 8, 6, 3, 9, 7, 2, 9, 5, 9, 1, 6, 5, 5, 5, 2, 3, 8, 5, 5, 5, 3, 4, 0, 2, 4, 1, 4, 0, 0, 5, 8, 2, 1, 8, 4, 2, 9, 0, 3, 1, 0, 9, 9, 6, 3, 5, 3, 5, 6, 0, 2, 9, 1, 8, 9, 8, 7, 5, 9, 7, 4, 3, 9, 9, 7, 9, 1, 8, 0, 1, 6, 8, 2, 4, 9, 6, 8, 1, 9, 9, 4, 2, 3, 2, 4, 3, 2, 8, 8, 5, 7, 7, 4, 9, 8, 4, 7, 2, 4, 8, 0, 9, 3, 4, 5, 9, 6, 5, 0, 3, 1, 7, 8, 2, 3, 8, 3, 2, 0, 8, 0, 8, 9, 9, 0, 6, 4, 6, 4, 6, 4, 6, 6, 8, 1, 1, 7, 3, 1, 3, 7, 2, 7, 2, 0, 8, 0, 5, 4, 3, 9, 9, 8, 4, 8, 3, 3, 4, 2, 3, 5, 3, 5, 5, 1, 7, 6, 5, 7, 1, 7, 8, 0, 2, 0, 6, 8, 1, 4, 1, 1, 1, 2, 8, 5, 2, 7, 2, 6, 7, 5, 2, 5, 3, 5, 8, 1, 4, 8, 9, 8, 6, 3, 9, 0, 6, 2, 5, 8, 7, 1, 2, 2, 6, 9, 3, 0, 4, 6, 8, 8, 8, 3, 2, 4, 7, 5, 5, 4, 9, 1, 3, 0, 0, 7, 8, 9, 6, 7, 0, 2, 4, 8, 8, 1, 5, 1, 8, 0, 4, 7, 0, 7, 8, 2, 9, 0, 4, 9, 5, 4, 5, 5, 8, 3, 8, 5, 2, 2, 4, 7, 3, 4, 8, 0, 9, 2, 8, 4, 9, 4, 8, 6, 0, 0, 2, 7, 8, 0, 2, 2, 7, 2, 6, 4, 6, 9, 5, 5, 0, 9, 9, 8, 0, 8, 7, 8, 5, 7, 2, 7, 5, 0, 2, 3, 1, 4, 0, 1, 4, 6, 0, 5, 0, 0, 2, 1, 5, 6, 6, 9, 9, 9, 9, 9, 3, 5, 8, 0, 8, 6, 8, 6, 4, 7, 3, 1, 6, 3, 9, 9, 8, 0, 4, 7, 6, 7, 6, 5, 5, 9, 1, 9, 6, 9, 5, 0, 9, 9, 7, 3, 6, 7, 2, 7, 5, 4, 4, 7, 3, 7, 3, 3, 0, 4, 7, 6, 5, 8, 5, 1, 8, 8, 8, 1, 0, 1, 3, 5, 2, 3, 0, 9, 2, 8, 9, 5, 1, 3, 0, 3, 4, 1, 1, 1, 5, 5, 9, 3, 4, 9, 3, 7, 8, 3, 0, 8, 3, 2, 9, 8, 2, 2, 3, 6, 8, 1, 8, 0, 8, 3, 6, 5, 5, 1, 1, 7, 8, 2, 6, 3, 8, 9, 2, 3, 3, 3, 2, 3, 2, 3, 1, 0, 6, 3, 5, 2, 9, 6, 3, 4, 7, 8, 8, 2, 8, 1, 9, 6, 2, 7, 8, 9, 3, 4, 9, 7, 1, 4, 5, 4, 4, 1, 6, 9, 1, 6, 1, 4, 2, 1, 3, 3, 1, 0, 3, 4, 5, 5, 5, 6, 7, 7, 3, 6, 3, 3, 7, 0, 1, 0, 8, 1, 9, 5, 6, 9, 9, 6, 8, 8, 5, 5, 8, 2, 7, 3, 5, 9, 0, 0, 2, 2, 3, 4, 5, 3, 1, 6, 3, 9, 6, 6, 5, 1, 4, 9, 9, 6, 5, 6, 4, 7, 0, 3, 0, 4, 4, 2, 8, 8, 1, 8, 2, 5, 8, 1, 8, 6, 6, 2, 0, 5, 9, 8, 5, 2, 6, 1, 3, 1, 6, 2, 6, 1, 7, 5, 1, 6, 7, 2, 4, 1, 5, 0, 2, 6, 2, 1, 8, 9, 5, 3, 9, 0, 8, 5, 1, 0, 3, 5, 9, 1, 4, 8, 7, 1, 6, 7, 8, 5, 2, 2, 6, 8, 2, 4, 2, 5, 6, 6, 5, 2, 3, 5, 6, 1, 9, 9, 4, 7, 1, 7, 8, 4, 7, 5, 7, 0, 6, 9, 1, 3, 7, 6, 9, 6, 0, 4, 0, 0, 3, 9, 9, 8, 0, 0, 6, 9, 4, 6, 3, 4, 1, 3, 2, 1, 8, 4, 2, 8, 1, 3, 6, 2, 8, 9, 0, 7, 7, 7, 6, 9, 0, 3, 9, 9, 0, 2, 8, 3, 5, 6, 9, 5, 7, 7, 1, 1, 7, 3, 7, 2, 6, 3, 1, 3, 0, 6, 8, 0, 6, 3, 7, 9, 7, 7, 1, 9, 7, 9, 4, 0, 0, 4, 9, 7, 2, 5, 0, 1, 2, 8, 4, 9, 6, 7, 9, 1, 4, 6, 9, 5, 2, 0, 3, 3, 7, 8, 1, 0, 7, 6, 3, 8, 3, 1, 8, 9, 2, 5, 8, 6, 7, 9, 5, 2, 5, 0, 1, 3, 0, 9, 8, 2, 9, 3, 3, 6, 7, 9, 4, 1, 8, 5, 7, 3, 5, 4, 2, 1, 9, 7, 9, 3, 0, 4, 4, 0, 4, 7, 2, 5, 7, 3, 3, 1, 9, 8, 9, 9, 7, 6, 2, 3, 9, 6, 8, 5, 5, 9, 1, 3, 2, 0, 0, 6, 0, 2, 2, 2, 8, 1, 9, 7, 5, 6, 0, 6, 8, 8, 6, 4, 5, 0, 5, 6, 3, 6, 2, 0, 4, 3, 9, 8, 8, 3, 3, 9, 9, 6, 5, 5, 5, 1, 4, 8, 3, 2, 5, 9, 3, 7, 5, 8, 0, 1, 3, 1, 8, 5, 3, 3, 8, 3, 4, 0, 5, 9, 0, 2, 3, 9, 5, 5, 0, 8, 2, 7, 3, 6, 3, 8, 0, 0, 4, 6, 3, 1, 6, 5, 1, 8, 0, 9, 4, 4, 5, 6, 6, 4, 5, 5, 9, 8, 3, 2, 8, 6, 5, 8, 9, 4, 0, 6, 0, 0, 4, 7, 9, 2, 8, 0, 2, 1, 9, 7, 6, 3, 7, 7, 6, 3, 3, 8, 3, 6, 2, 0, 0, 9, 2, 6, 9, 4, 5, 5, 9, 2, 9, 1, 5, 0, 6, 2, 0, 2, 5, 6, 4, 4, 7, 1, 3, 4, 9, 0, 1, 8, 4, 2, 6, 2, 1, 2, 8, 2, 1, 0, 2, 6, 3, 1, 8, 8, 6, 9, 4, 8, 1, 4, 2, 0, 0, 5, 7, 5, 6, 9, 5, 6, 8, 6, 7, 8, 7, 6, 7, 3, 6, 2, 4, 2, 5, 1, 0, 4, 4, 9, 5, 0, 8, 5, 7, 2, 0, 9, 4, 3, 2, 3, 8, 3, 2, 6, 4, 2, 1, 7, 5, 1, 9, 7, 3, 1, 0, 1, 5, 3, 9, 9, 2, 6, 1, 8, 1, 7, 7, 1, 0, 7, 1, 7, 8, 8, 8, 0, 8, 6, 0, 4, 9, 3, 4, 9, 5, 7, 2, 8, 8, 2, 8, 9, 3, 6, 9, 2, 5, 6, 9, 9, 2, 4, 4, 5, 4, 4, 1, 3, 6, 9, 2, 2, 2, 6, 0, 5, 0, 2, 9, 8, 1, 7, 3, 3, 9, 0, 4, 1, 9, 5, 7, 9, 2, 6, 4, 9, 0, 9, 0, 9, 2, 2, 2, 9, 2, 7, 4, 4, 0, 9, 5, 6, 1, 9, 7, 0, 2, 0, 6, 5, 9, 7, 4, 8, 7, 5, 4, 7, 3, 7, 1, 3, 8, 1, 3, 1, 4, 8, 1, 5, 3, 1, 5, 5, 1, 5, 6, 6, 2, 6, 1, 2, 4, 3, 5, 9, 5, 7, 4, 5, 3, 1, 1, 8, 5, 2, 7, 3, 8, 4, 3, 5, 0, 9, 5, 2, 6, 6, 0, 7, 0, 6, 7, 2, 5, 9, 6, 2, 4, 3, 7, 8, 2, 9, 3, 9, 6, 5, 5, 8, 1, 5, 1, 8, 6, 0, 7, 2, 5, 8, 3, 7, 4, 4, 5, 0, 0, 9, 5, 9, 4, 1, 2, 0, 0, 7, 6, 5, 4, 6, 8, 5, 8, 6, 1, 7, 6, 5, 4, 2, 4, 9, 7, 6, 6, 9, 5, 8, 4, 1, 7, 1, 7, 0, 6, 5, 7, 1, 9, 1, 2, 7, 0, 2, 4, 9, 3, 7, 8, 1, 4, 8, 8, 7, 0, 7, 0, 4, 2, 3, 3, 0, 8, 4, 7, 1, 1, 3, 2, 8, 0, 7, 4, 5, 1, 7, 9, 3, 2, 6, 4, 6, 5, 8, 9, 5, 5, 1, 8, 4, 6, 0, 4, 3, 2, 9, 8, 6, 9, 9, 8, 8, 4, 5, 5, 3, 4, 0, 1, 0, 5, 1, 8, 2, 3, 1, 0, 8, 0, 2, 9, 3, 2, 6, 0, 3, 6, 4, 4, 2, 1, 9, 8, 0, 2, 5, 2, 3, 9, 0, 3, 7, 3, 6, 3, 6, 3, 6, 5, 3, 3, 7, 0, 4, 8, 9, 9, 7, 2, 7, 7, 6, 5, 8, 3, 8, 0, 3, 0, 0, 9, 8, 4, 8, 1, 9, 2, 3, 5, 4, 9, 9, 2, 5, 9, 9, 8, 7, 6, 8, 0, 7, 5, 8, 2, 6, 5, 3, 2, 4, 2, 4, 4, 5, 0, 5, 3, 5, 5, 9, 9, 7, 5, 7, 0, 8, 3, 3, 6, 8, 8, 4, 2, 1, 4, 9, 0, 5, 9, 8, 5, 7, 4, 6, 8, 4, 7, 1, 5, 0, 2, 7, 5, 7, 8, 4, 3, 7, 4, 7, 8, 1, 6, 9, 3, 9, 1, 6, 8, 4, 9, 8, 4, 5, 5, 8, 3, 2, 0, 3, 1, 9, 5, 8, 8, 9, 1, 7, 1, 5, 2, 7, 3, 4, 9, 9, 2, 5, 8, 5, 5, 8, 9, 3, 3, 9, 5, 0, 5, 1, 1, 0, 0, 2, 7, 1, 9, 6, 6, 4, 9, 3, 4, 1, 3, 6, 3, 5, 5, 5, 9, 3, 6, 5, 8, 6, 8, 1, 0, 7, 3, 6, 8, 1, 6, 3, 7, 0, 6, 3, 2, 8, 7, 6, 6, 5, 7, 9, 0, 8, 8, 8, 7, 5, 3, 7, 0, 9, 7, 1, 3, 3, 7, 5, 3, 3, 6, 8, 6, 0, 7, 3, 4, 7, 1, 4, 2, 3, 2, 1, 3, 9, 7, 9, 6, 0, 8, 7, 9, 1, 2, 2, 3, 4, 0, 3, 4, 6, 0, 4, 5, 0, 3, 6, 6, 6, 1, 9, 9, 1, 7, 9, 4, 2, 3, 8, 1, 6, 8, 6, 6, 9, 3, 8, 5, 9, 2, 0, 5, 0, 0, 2, 7, 5, 8, 2, 0, 0, 8, 6, 2, 5, 7, 7, 8, 7, 4, 2, 8, 2, 9, 1, 5, 4, 6, 3, 0, 4, 7, 4, 4, 1, 8, 0, 3, 7, 2, 0, 1, 7, 0, 3, 8, 9, 2, 6, 8, 5, 0, 6, 3, 0, 7, 6, 0, 5, 2, 6, 9, 0, 8, 2, 0, 0, 4, 2, 3, 3, 1, 3, 8, 9, 9, 3, 2, 4, 6, 4, 1, 0, 4, 9, 3, 2, 0, 1, 7, 9, 0, 2, 2, 0, 8, 4, 2, 0, 1, 1, 9, 5, 0, 6, 6, 1, 8, 3, 8, 1, 0, 0, 5, 8, 8, 2, 0, 5, 1, 7, 9, 9, 2, 1, 2, 3, 0, 4, 2, 9, 1, 3, 1, 5, 9, 2, 0, 7, 4, 3, 9, 2, 9, 9, 2, 0, 3, 4, 7, 1, 3, 5, 1, 2, 9, 5, 1, 0, 4, 0, 4, 5, 6, 4, 0, 9, 2, 2, 7, 8, 4, 0, 5, 2, 3, 8, 3, 4, 5, 4, 3, 4, 4, 7, 5, 1, 0, 8, 5, 4, 1, 4, 7, 1, 5, 5, 1, 6, 0, 5, 0, 4, 6, 5, 9, 0, 3, 6, 2, 7, 0, 4, 2, 4, 1, 7, 9, 5, 6, 5, 9, 1, 4, 9, 4, 3, 4, 6, 8, 7, 2, 5, 7, 5, 9, 6, 4, 8, 0, 7, 3, 4, 6, 2, 8, 9, 5, 2, 3, 0, 1, 1, 2, 1, 1, 3, 1, 6, 7, 4, 8, 7, 4, 4, 8, 3, 2, 9, 4, 0, 5, 7, 5, 7, 1, 4, 2, 1, 9, 4, 8, 8, 4, 4, 0, 4, 7, 8, 9, 2, 2, 3, 4, 6, 7, 9, 8, 9, 5, 6, 1, 1, 2, 8, 8, 3, 1, 0, 5, 6, 1, 9, 5, 8, 4, 2, 5, 8, 0, 5, 5, 6, 9, 9, 3, 5, 9, 8, 6, 0, 1, 7, 1, 5, 9, 3, 8, 9, 3, 8, 5, 7, 1, 4, 0, 4, 9, 8, 3, 1, 7, 1, 9, 4, 6, 5, 7, 2, 9, 8, 5, 7, 0, 0, 8, 9, 9, 4, 9, 4, 7, 1, 6, 5, 3, 6, 2, 4, 1, 2, 0, 8, 3, 6, 3, 1, 5, 8, 9, 0, 0, 7, 1, 3, 8, 2, 1, 8, 1, 5, 5, 0, 3, 8, 3, 3, 8, 5, 3, 9, 5, 3, 9, 2, 2, 1, 3, 5, 8, 7, 9, 2, 0, 8, 7, 6, 8, 1, 1, 4, 8, 7, 0, 6, 1, 2, 9, 8, 9, 8, 5, 4, 9, 3, 5, 6, 2, 0, 1, 7, 2, 0, 8, 4, 2, 8, 1, 1, 6, 9, 2, 0, 6, 0, 8, 3, 3, 2, 0, 2, 9, 6, 5, 3, 4, 8, 5, 7, 7, 3, 0, 6, 3, 3, 9, 1, 6, 9, 7, 8, 5, 8, 7, 8, 9, 3, 7, 4, 1, 3, 0, 7, 9, 9, 4, 8, 4, 3, 0, 3, 7, 2, 9, 1, 5, 9, 5, 7, 8, 4, 9, 1, 2, 6, 7, 4, 8, 6, 0, 0, 6, 3, 3, 8, 7, 9, 9, 1, 3, 6, 1, 6, 1, 8, 5, 9, 2, 2, 1, 9, 5, 0, 1, 4, 7, 3, 4, 4, 5, 0, 4, 4, 7, 5, 3, 9, 6, 2, 4, 2, 0, 9, 9, 2, 0, 7, 5, 2, 4, 1, 8, 9, 2, 9, 6, 8, 6, 2, 6, 7, 3, 4, 1, 9, 4, 5, 3, 4, 3, 6, 7, 7, 1, 4, 0, 5, 7, 1, 5, 9, 2, 0, 0, 6, 1, 6, 9, 0, 6, 7, 0, 6, 4, 3, 0, 0, 4, 7, 3, 6, 4, 6, 1, 7, 0, 4, 5, 7, 4, 6, 8, 3, 6, 2, 7, 5, 8, 6, 3, 2, 7, 4, 3, 3, 0, 9, 7, 7, 5, 0, 1, 8, 6, 9, 9, 8, 8, 6, 0, 2, 6, 4, 8, 8, 6, 4, 9, 6, 0, 8, 8, 8, 3, 9, 1, 0, 1, 1, 6, 8, 6, 7, 3, 5, 6, 4, 4, 0, 1, 2, 4, 4, 5, 2, 9, 2, 5, 8, 0, 6, 6, 0, 6, 4, 2, 1, 9, 7, 0, 1, 6, 2, 4, 9, 5, 4, 3, 6, 0, 3, 1, 6, 3, 4, 0, 6, 2, 8, 1, 4, 2, 3, 6, 0, 4, 8, 1, 0, 0, 3, 7, 9, 0, 7, 7, 7, 6, 1, 4, 8, 6, 3, 2, 5, 2, 1, 9, 9, 1, 4, 0, 6, 5, 6, 7, 1, 3, 2, 0, 9, 9, 0, 9, 7, 7, 3, 6, 5, 5, 8, 4, 0, 6, 6, 9, 4, 7, 7, 1, 3, 1, 1, 2, 7, 2, 4, 3, 6, 1, 8, 3, 8, 0, 4, 4, 0, 1, 5, 5, 4, 2, 2, 8, 1, 8, 9, 3, 7, 1, 9, 0, 0, 6, 3, 8, 7, 0, 5, 6, 5, 4, 2, 6, 3, 8, 9, 8, 0, 9, 7, 2, 5, 3, 0, 7, 2, 5, 7, 2, 8, 6, 1, 5, 7, 1, 9, 3, 3, 0, 2, 0, 6, 9, 2, 3, 7, 0, 3, 6, 1, 6, 5, 9, 3, 2, 8, 2, 8, 8, 5, 7, 4, 0, 5, 5, 3, 3, 8, 6, 9, 3, 8, 0, 8, 4, 5, 5, 9, 0, 2, 5, 4, 5, 8, 6, 8, 2, 1, 7, 0, 9, 7, 7, 2, 2, 2, 7, 6, 6, 6, 3, 4, 2, 4, 0, 9, 9, 7, 5, 2, 3, 3, 8, 6, 1, 5, 8, 3, 3, 7, 9, 8, 6, 5, 4, 5, 0, 7, 5, 1, 6, 0, 6, 3, 3, 6, 3, 4, 3, 0, 5, 1, 0, 7, 0, 7, 4, 8, 2, 3, 9, 0, 6, 5, 8, 1, 4, 1, 8, 6, 7, 6, 9, 4, 7, 6, 3, 6, 3, 0, 1, 5, 7, 4, 1, 0, 8, 8, 7, 0, 9, 0, 7, 5, 0, 7, 0, 7, 7, 9, 1, 6, 2, 1, 0, 1, 0, 4, 3, 2, 5, 0, 9, 9, 2, 3, 9, 9, 4, 4, 1, 8, 9, 5, 3, 3, 7, 5, 2, 5, 0, 5, 3, 8, 9, 1, 9, 1, 3, 8, 9, 4, 3, 5, 8, 6, 5, 7, 8, 2, 8, 0, 9, 8, 0, 1, 0, 6, 0, 1, 4, 0, 1, 7, 7, 9, 8, 8, 0, 2, 8, 1, 6, 3, 6, 6, 0, 5, 0, 1, 3, 1, 9, 1, 7, 4, 8, 2, 0, 9, 0, 8, 9, 8, 2, 7, 1, 8, 8, 5, 3, 3, 1, 1, 7, 8, 6, 9, 7, 0, 9, 1, 5, 8, 4, 6, 0, 0, 4, 9, 6, 9, 0, 9, 5, 2, 2, 0, 2, 7, 5, 1, 9, 8, 9, 2, 1, 3, 1, 7, 0, 7, 8, 3, 2, 7, 0, 1, 2, 2, 9, 7, 2, 0, 5, 3, 9, 6, 3, 2, 5, 6, 8, 8, 4, 5, 5, 5, 6, 4, 8, 9, 6, 3, 4, 6, 4, 4, 7, 8, 0, 8, 5, 4, 6, 5, 5, 8, 3, 3, 3, 4, 2, 7, 8, 1, 4, 8, 7, 7, 3, 8, 6, 5, 9, 7, 5, 8, 8, 8, 8, 6, 1, 0, 5, 0, 6, 7, 6, 3, 1, 2, 6, 7, 5, 9, 4, 1, 4, 6, 5, 1, 7, 7, 2, 4, 9, 2, 7, 6, 0, 8, 9, 5, 7, 1, 1, 2, 7, 0, 9, 1, 9, 5, 4, 7, 7, 7, 0, 8, 8, 7, 3, 6, 6, 3, 9, 8, 2, 9, 3, 8, 6, 0, 6, 7, 1, 5, 5, 2, 8, 6, 5, 2, 9, 1, 9, 9, 7, 1, 7, 1, 8, 3, 7, 5, 0, 3, 7, 1, 9, 6, 7, 8, 0, 2, 9, 6, 9, 4, 6, 0, 9, 6, 5, 6, 7, 6, 8, 9, 3, 8, 9, 1, 8, 7, 5, 9, 0, 5, 8, 9, 9, 6, 6, 1, 9, 0, 7, 6, 3, 3, 1, 7, 7, 4, 8, 4, 9, 3, 1, 4, 8, 2, 7, 4, 0, 9, 4, 2, 3, 8, 5, 2, 8, 6, 8, 3, 6, 5, 8, 9, 8, 0, 8, 7, 2, 1, 8, 0, 4, 8, 6, 8, 8, 2, 7, 0, 2, 3, 2, 6, 2, 0, 0, 9, 8, 8, 7, 5, 5, 4, 3, 4, 0, 0, 8, 0, 1, 6, 6, 6, 0, 3, 0, 3, 1, 7, 0, 1, 4, 2, 6, 3, 7, 9, 3, 6, 4, 5, 5, 1, 8, 9, 7, 9, 9, 3, 0, 6, 6, 4, 6, 9, 3, 7, 7, 4, 4, 4, 6, 5, 2, 9, 9, 2, 1, 2, 2, 1, 9, 9, 6, 5, 1, 3, 2, 9, 1, 6, 2, 9, 6, 8, 9, 8, 1, 9, 6, 5, 1, 1, 5, 7, 6, 3, 0, 4, 5, 5, 5, 2, 4, 8, 4, 7, 2, 6, 1, 1, 1, 0, 7, 3, 4, 0, 9, 2, 2, 0, 3, 3, 2, 6, 5, 7, 1, 3, 7, 9, 6, 6, 3, 7, 7, 3, 9, 2, 6, 3, 1, 1, 3, 3, 8, 3, 8, 3, 5, 6, 8, 3, 5, 5, 7, 5, 5, 6, 7, 5, 4, 7, 4, 8, 8, 3, 4, 6, 0, 3, 1, 4, 8, 5, 9, 9, 1, 4, 3, 8, 4, 0, 8, 4, 4, 7, 7, 6, 5, 1, 3, 3, 4, 6, 8, 4, 7, 4, 5, 7, 8, 7, 3, 3, 8, 9, 3, 5, 8, 5, 3, 9, 5, 1, 4, 5, 5, 5, 7, 8, 6, 4, 6, 4, 5, 4, 8, 7, 8, 1, 8, 7, 4, 9, 4, 5, 6, 2, 7, 7, 7, 7, 4, 6, 9, 9, 0, 8, 4, 9, 0, 8, 8, 3, 9, 0, 4, 2, 7, 8, 3, 8, 8, 1, 9, 5, 4, 0, 7, 1, 0, 6, 3, 1, 4, 9, 9, 2, 3, 9, 9, 9, 0, 4, 1, 8, 4, 9, 2, 8, 3, 4, 9, 3, 5, 9, 1, 0, 5, 0, 3, 8, 6, 3, 1, 7, 5, 8, 1, 0, 7, 0, 2, 0, 1, 3, 1, 1, 7, 1, 9, 1, 1, 1, 2, 8, 0, 1, 1, 8, 5, 2, 5, 8, 4, 1, 0, 3, 1, 3, 3, 5, 4, 7, 0, 4, 1, 2, 4, 8, 4, 7, 9, 1, 4, 9, 0, 3, 5, 4, 5, 8, 4, 7, 7, 2, 4, 3, 2, 5, 6, 9, 3, 1, 4, 2, 2, 2, 1, 4, 0, 1, 1, 4, 7, 1, 3, 7, 8, 2, 1, 5, 9, 3, 0, 0, 8, 9, 5, 8, 7, 7, 5, 3, 9, 0, 0, 3, 4, 9, 9, 1, 0, 2, 9, 1, 2, 4, 4, 1, 5, 3, 3, 8, 4, 4, 7, 8, 9, 5, 4, 2, 4, 3, 8, 3, 1, 6, 5, 2, 5, 0, 7, 5, 8, 5, 3, 5, 4, 2, 3, 9, 4, 1, 4, 1, 2, 3, 5, 4, 9, 2, 7, 1, 9, 2, 0, 3, 9, 2, 4, 8, 4, 2, 3, 4, 6, 6, 1, 8, 7, 7, 1, 7, 5, 6, 9, 6, 3, 4, 4, 5, 7, 9, 1, 1, 7, 5, 3, 8, 3, 1, 6, 8, 4, 3, 5, 1, 7, 8, 8, 0, 2, 4, 7, 0, 2, 4, 8, 1, 4, 6, 1, 4, 1, 6, 7, 9, 9, 0, 3, 3, 3, 0, 8, 8, 6, 6, 4, 3, 6, 6, 9, 1, 7, 4, 4, 4, 9, 5, 4, 8, 3, 2, 3, 4, 6, 3, 5, 2, 5, 2, 1, 3, 1, 3, 0, 7, 9, 6, 6, 5, 8, 2, 2, 6, 8, 1, 1, 2, 3, 8, 0, 6, 9, 1, 4, 7, 1, 0, 3, 6, 0, 3, 5, 5, 3, 0, 3, 1, 9, 9, 1, 1, 3, 6, 4, 7, 9, 5, 4, 4, 3, 4, 7, 5, 1, 6, 1, 2, 3, 9, 0, 9, 3, 1, 0, 7, 0, 1, 7, 0, 3, 0, 4, 6, 4, 3, 0, 6, 4, 5, 2, 0, 5, 1, 2, 9, 2, 0, 2, 6, 8, 9, 9, 5, 5, 0, 6, 7, 6, 2, 2, 8, 8, 0, 9, 9, 7, 3, 3, 9, 3, 9, 1, 9, 5, 5, 8, 7, 0, 2, 2, 8, 0, 9, 3, 2, 1, 8, 4, 0, 4, 4, 8, 3, 3, 3, 1, 2, 2, 1, 0, 6, 2, 5, 9, 9, 2, 0, 6, 1, 6, 6, 7, 6, 2, 0, 8, 9, 3, 9, 5, 3, 2, 3, 8, 3, 4, 9, 1, 1, 7, 0, 0, 4, 6, 5, 3, 9, 9, 3, 2, 5, 4, 4, 2, 4, 0, 9, 2, 8, 4, 3, 8, 5, 5, 0, 0, 3, 7, 7, 0, 4, 2, 6, 0, 1, 4, 8, 1, 5, 5, 5, 5, 6, 4, 2, 4, 9, 4, 0, 0, 6, 5, 7, 7, 1, 7, 1, 6, 0, 1, 1, 0, 1, 8, 0, 8, 4, 5, 6, 8, 4, 1, 3, 5, 4, 1, 8, 0, 2, 8, 3, 4, 3, 9, 8, 6, 9, 5, 1, 6, 5, 7, 2, 4, 6, 2, 5, 9, 7, 2, 2, 7, 8, 2, 2, 7, 3, 4, 0, 7, 9, 7, 7, 1, 6, 7, 3, 9, 3, 8, 1, 2, 0, 8, 8, 9, 3, 0, 8, 6, 6, 2, 4, 3, 4, 2, 5, 7, 5, 5, 1, 8, 6, 6, 5, 1, 5, 5, 1, 1, 6, 2, 5, 9, 4, 6, 6, 0, 1, 2, 4, 3, 7, 2, 7, 6, 2, 2, 7, 8, 9, 3, 1, 9, 0, 8, 0, 0, 8, 2, 2, 6, 6, 6, 9, 8, 0, 8, 6, 5, 9, 3, 0, 2, 3, 6, 8, 3, 7, 1, 0, 4, 1, 8, 6, 0, 0, 6, 0, 0, 7, 3, 4, 9, 5, 8, 0, 0, 9, 2, 6, 9, 0, 7, 7, 1, 5, 7, 4, 2, 8, 2, 7, 7, 6, 0, 4, 1, 8, 6, 7, 4, 1, 7, 0, 1, 5, 0, 7, 8, 3, 3, 2, 3, 7, 1, 0, 5, 9, 3, 9, 4, 1, 6, 1, 7, 9, 3, 8, 2, 3, 6, 6, 2, 8, 5, 1, 8, 5, 1, 7, 0, 1, 6, 4, 3, 5, 5, 3, 2, 7, 5, 3, 8, 2, 2, 1, 1, 7, 1, 4, 7, 2, 9, 6, 5, 4, 0, 1, 8, 5, 5, 9, 6, 6, 6, 8, 7, 3, 3, 8, 5, 2, 0, 7, 4, 2, 6, 7, 8, 6, 0, 9, 4, 0, 7, 7, 2, 7, 9, 4, 3, 9, 0, 9, 5, 5, 7, 9, 4, 1, 0, 6, 5, 7, 0, 0, 3, 1, 8, 7, 6, 4, 6, 5, 4, 7, 5, 3, 9, 6, 1, 6, 4, 1, 3, 8, 4, 0, 9, 3, 2, 5, 0, 7, 4, 6, 0, 6, 3, 1, 4, 4, 5, 8, 7, 7, 5, 9, 2, 6, 0, 4, 6, 3, 8, 2, 8, 9, 4, 8, 1, 3, 8, 5, 6, 4, 2, 3, 7, 4, 8, 4, 6, 6, 1, 7, 6, 5, 2, 8, 8, 2, 2, 8, 2, 4, 2, 1, 6, 8, 5, 5, 8, 6, 2, 5, 7, 9, 2, 7, 0, 7, 3, 1, 5, 3, 8, 5, 4, 1, 8, 8, 4, 6, 4, 0, 0, 3, 4, 8, 6, 4, 5, 4, 4, 3, 2, 5, 3, 5, 3, 5, 4, 5, 9, 8, 3, 8, 8, 9, 4, 6, 5, 7, 8, 3, 1, 0, 0, 8, 3, 1, 0, 8, 0, 0, 9, 3, 1, 1, 8, 7, 0, 9, 3, 4, 9, 0, 8, 9, 3, 1, 2, 2, 4, 9, 3, 7, 8, 1, 9, 7, 3, 4, 7, 4, 8, 6, 2, 6, 3, 4, 3, 5, 7, 8, 9, 0, 2, 5, 8, 9, 1, 3, 0, 7, 6, 8, 8, 0, 5, 9, 9, 3, 5, 8, 2, 8, 0, 0, 2, 5, 7, 0, 9, 0, 5, 3, 9, 7, 3, 2, 2, 9, 9, 8, 9, 1, 1, 1, 4, 9, 5, 5, 8, 5, 5, 3, 5, 6, 3, 2, 7, 9, 2, 1, 8, 8, 6, 0, 0, 9, 9, 8, 2, 1, 8, 2, 6, 0, 0, 9, 4, 3, 4, 7, 8, 6, 2, 7, 3, 8, 2, 5, 6, 4, 0, 9, 1, 4, 1, 8, 1, 1, 8, 6, 5, 3, 6, 5, 2, 7, 3, 5, 0, 6, 4, 5, 0, 0, 3, 1, 7, 3, 1, 5, 9, 1, 5, 8, 4, 3, 4, 6, 2, 3, 5, 6, 4, 8, 1, 2, 1, 3, 8, 8, 6, 9, 4, 2, 8, 2, 0, 3, 1, 4, 6, 8, 0, 1, 1, 1, 4, 9, 6, 9, 6, 1, 0, 3, 6, 1, 1, 3, 0, 6, 7, 5, 6, 0, 7, 6, 0, 3, 7, 7, 2, 7, 2, 5, 7, 0, 6, 3, 1, 2, 6, 5, 0, 7, 9, 2, 9, 3, 7, 4, 4, 6, 7, 5, 2, 7, 3, 5, 2, 2, 0, 3, 8, 3, 8, 7, 5, 5, 6, 6, 2, 8, 6, 7, 0, 1, 1, 6, 9, 8, 9, 0, 7, 8, 7, 5, 3, 0, 6, 0, 5, 9, 5, 5, 6, 1, 8, 6, 5, 6, 6, 0, 1, 9, 6, 3, 1, 2, 6, 7, 1, 9, 5, 4, 9, 3, 0, 8, 6, 7, 0, 8, 7, 3, 2, 1, 3, 3, 8, 4, 8, 7, 9, 5, 5, 8, 2, 7, 3, 1, 9, 8, 4, 4, 5, 7, 6, 8, 1, 5, 7, 9, 9, 1, 9, 9, 2, 4, 3, 3, 5, 1, 9, 1, 2, 4, 6, 7, 2, 2, 0, 7, 1, 5, 5, 2, 5, 1, 3, 5, 7, 5, 8, 1, 0, 3, 5, 5, 9, 0, 8, 4, 3, 8, 9, 6, 1, 5, 3, 0, 9, 0, 8, 6, 5, 2, 3, 3, 1, 3, 1, 3, 0, 2, 0, 0, 7, 5, 9, 0, 8, 5, 9, 2, 1, 4, 4, 6, 2, 0, 9, 7, 2, 0, 0, 3, 5, 4, 3, 5, 9, 1, 7, 1, 6, 6, 6, 2, 8, 1, 4, 1, 0, 1, 3, 2, 5, 7, 9, 8, 9, 8, 8, 5, 1, 9, 5, 1, 3, 8, 2, 6, 2, 8, 4, 7, 9, 1, 5, 0, 2, 7, 4, 8, 4, 0, 6, 8, 4, 7, 0, 9, 8, 7, 0, 1, 7, 6, 4, 2, 4, 3, 7, 2, 1, 2, 7, 1, 3, 1, 4, 8, 6, 7, 9, 3, 5, 6, 9, 2, 8, 6, 3, 5, 1, 8, 8, 0, 1, 6, 8, 2, 8, 4, 2, 4, 2, 0, 9, 0, 4, 3, 9, 6, 2, 1, 2, 8, 8, 7, 9, 1, 6, 0, 0, 6, 4, 2, 1, 5, 6, 6, 5, 3, 9, 7, 8, 6, 1, 5, 5, 2, 5, 7, 8, 9, 2, 0, 7, 6, 7, 7, 5, 1, 2, 6, 0, 2, 9, 2, 5, 2, 8, 6, 6, 6, 1, 8, 6, 1, 0, 5, 5, 3, 8, 3, 3, 1, 1, 2, 0, 3, 3, 4, 5, 5, 2, 2, 3, 8, 7, 1, 9, 3, 8, 6, 0, 0, 3, 5, 7, 0, 0, 9, 2, 9, 0, 7, 4, 3, 4, 5, 6, 6, 8, 1, 2, 8, 1, 0, 0, 8, 8, 9, 3, 1, 7, 4, 6, 5, 0, 6, 5, 4, 3, 9, 2, 8, 2, 9, 6, 7, 4, 7, 2, 2, 6, 9, 5, 7, 5, 0, 1, 3, 0, 1, 0, 1, 4, 1, 7, 3, 5, 5, 8, 0, 7, 3, 3, 1, 4, 0, 3, 6, 4, 5, 9, 0, 0, 2, 5, 5, 5, 0, 0, 9, 5, 3, 8, 7, 6, 8, 1, 5, 5, 2, 3, 4, 2, 0, 5, 6, 5, 3, 3, 7, 3, 1, 0, 6, 0, 1, 2, 1, 0, 3, 4, 2, 0, 1, 6, 5, 6, 0, 9, 1, 0, 4, 6, 5, 1, 2, 3, 4, 0, 3, 8, 9, 8, 8, 5, 4, 0, 1, 2, 0, 8, 3, 4, 0, 2, 5, 3, 9, 1, 6, 7, 6, 4, 7, 5, 4, 4, 9, 0, 2, 5, 6, 3, 4, 0, 7, 1, 5, 7, 9, 5, 9, 8, 1, 9, 1, 7, 2, 5, 6, 8, 6, 4, 2, 0, 0, 4, 2, 2, 3, 7, 6, 4, 6, 5, 4, 2, 0, 2, 2, 9, 2, 7, 4, 8, 9, 2, 4, 1, 9, 2, 8, 5, 9, 6, 8, 3, 6, 2, 9, 7, 1, 1, 6, 4, 5, 8, 3, 1, 9, 0, 0, 4, 9, 3, 5, 0, 1, 7, 5, 1, 0, 1, 6, 4, 3, 1, 0, 9, 0, 4, 0, 1, 6, 7, 6, 7, 3, 9, 7, 5, 0, 4, 1, 0, 0, 4, 9, 0, 7, 1, 5, 5, 9, 5, 0, 3, 2, 7, 7, 4, 7, 1, 9, 4, 3, 8, 3, 9, 4, 5, 4, 0, 0, 8, 5, 4, 1, 5, 3, 8, 0, 8, 1, 8, 0, 5, 4, 7, 3, 1, 0, 4, 7, 0, 6, 1, 4, 8, 3, 1, 1, 5, 7, 3, 5, 6, 6, 8, 9, 0, 9, 4, 1, 4, 4, 6, 8, 0, 6, 4, 6, 0, 4, 3, 4, 6, 1, 4, 2, 4, 1, 1, 0, 6, 8, 0, 4, 8, 0, 9, 9, 6, 1, 2, 9, 0, 2, 5, 7, 1, 3, 8, 5, 4, 7, 6, 7, 3, 5, 8, 5, 0, 2, 4, 5, 7, 8, 8, 9, 3, 7, 8, 1, 4, 3, 8, 1, 9, 3, 7, 6, 0, 1, 2, 9, 5, 4, 5, 3, 8, 7, 0, 8, 2, 4, 1, 7, 1, 7, 3, 9, 1, 8, 2, 5, 8, 1, 5, 9, 0, 5, 2, 8, 8, 3, 6, 7, 3, 7, 8, 4, 3, 0, 8, 5, 5, 5, 0, 3, 5, 3, 4, 8, 6, 2, 7, 5, 1, 5, 3, 3, 5, 6, 8, 0, 9, 8, 2, 2, 9, 6, 3, 3, 4, 0, 7, 2, 4, 5, 7, 1, 2, 6, 9, 1, 2, 1, 6, 7, 4, 7, 0, 2, 8, 2, 3, 1, 0, 6, 8, 1, 4, 9, 0, 0, 1, 1, 2, 6, 6, 5, 4, 5, 8, 2, 4, 2, 3, 4, 5, 0, 0, 3, 9, 9, 7, 7, 5, 0, 5, 6, 3, 6, 7, 8, 7, 1, 7, 8, 6, 5, 2, 6, 3, 7, 8, 0, 6, 8, 9, 4, 6, 8, 7, 3, 5, 0, 3, 4, 5, 6, 3, 4, 1, 5, 5, 0, 6, 4, 1, 3, 2, 2, 9, 7, 8, 9, 7, 7, 6, 2, 4, 3, 6, 0, 2, 7, 5, 9, 8, 2, 8, 9, 0, 9, 5, 3, 3, 4, 6, 2, 8, 2, 7, 5, 3, 2, 4, 8, 8, 4, 8, 6, 5, 6, 2, 8, 0, 7, 4, 9, 2, 8, 9, 4, 5, 8, 0, 9, 8, 9, 1, 6, 5, 0, 9, 0, 5, 6, 4, 8, 5, 8, 7, 7, 8, 6, 1, 7, 0, 4, 3, 3, 1, 2, 9, 9, 6, 0, 7, 1, 9, 1, 9, 6, 2, 1, 9, 6, 9, 1, 1, 8, 4, 5, 5, 7, 9, 8, 9, 4, 0, 4, 0, 4, 2, 7, 1, 8, 0, 6, 0, 6, 0, 4, 2, 2, 6, 5, 7, 5, 5, 2, 6, 7, 6, 7, 6, 4, 8, 8, 8, 9, 5, 6, 2, 0, 9, 6, 9, 0, 6, 2, 2, 4, 8, 7, 3, 3, 0, 5, 8, 7, 5, 2, 4, 1, 3, 0, 8, 7, 7, 2, 2, 3, 5, 4, 4, 5, 0, 1, 6, 3, 4, 2, 1, 8, 5, 1, 7, 8, 4, 6, 5, 8, 5, 1, 9, 6, 7, 6, 3, 0, 1, 7, 9, 1, 9, 1, 2, 7, 6, 6, 6, 7, 0, 4, 8, 6, 3, 7, 4, 6, 1, 7, 2, 1, 4, 4, 1, 0, 7, 1, 0, 7, 0, 8, 1, 0, 6, 4, 9, 5, 2, 8, 2, 8, 5, 9, 4, 2, 5, 0, 3, 9, 5, 8, 7, 1, 2, 2, 6, 1, 5, 4, 8, 0, 1, 3, 7, 4, 0, 7, 7, 2, 4, 9, 3, 7, 9, 0, 2, 1, 0, 6, 2, 0, 6, 9, 3, 7, 4, 1, 3, 6, 1, 2, 3, 6, 3, 2, 2, 6, 1, 7, 0, 2, 7, 2, 6, 6, 1, 6, 6, 0, 4, 2, 4, 9, 7, 2, 4, 1, 5, 5, 4, 8, 1, 3, 6, 8, 3, 1, 4, 1, 7, 7, 5, 2, 0, 0, 6, 9, 8, 1, 1, 9, 0, 9, 1, 4, 5, 3, 6, 5, 4, 2, 8, 6, 5, 3, 7, 6, 8, 5, 0, 4, 4, 1, 1, 1, 3, 3, 0, 6, 4, 3, 8, 1, 2, 4, 3, 8, 9, 3, 9, 7, 0, 1, 2, 1, 1, 9, 1, 3, 2, 1, 8, 9, 8, 4, 1, 4, 8, 7, 5, 4, 5, 1, 3, 1, 4, 2, 3, 8, 5, 7, 8, 3, 8, 1, 0, 9, 7, 6, 9, 9, 7, 8, 7, 7, 1, 6, 3, 9, 4, 1, 1, 7, 5, 5, 6, 7, 9, 6, 6, 4, 8, 7, 2, 0, 1, 5, 6, 2, 7, 2, 5, 1, 3, 9, 8, 7, 8, 3, 2, 5, 8, 6, 1, 8, 7, 4, 7, 1, 0, 0, 5, 7, 2, 8, 5, 6, 6, 1, 3, 5, 8, 3, 0, 8, 3, 1, 4, 5, 6, 3, 5, 8, 5, 6, 8, 3, 6, 5, 4, 7, 6, 7, 0, 2, 2, 4, 7, 9, 1, 8, 3, 2, 9, 4, 8, 5, 7, 4, 6, 4, 9, 5, 6, 4, 0, 4, 8, 0, 7, 2, 0, 8, 9, 4, 9, 5, 1, 1, 9, 5, 3, 8, 6, 2, 6, 0, 8, 3, 0, 5, 7, 3, 0, 4, 0, 9, 1, 3, 8, 7, 0, 3, 8, 6, 5, 0, 4, 5, 1, 1, 7, 0, 7, 8, 2, 0, 5, 7, 5, 1, 8, 9, 7, 4, 4, 7, 9, 9, 5, 0, 5, 4, 3, 8, 8, 9, 3, 7, 5, 7, 1, 3, 1, 4, 5, 5, 8, 1, 7, 5, 8, 7, 0, 8, 7, 3, 3, 9, 2, 4, 5, 2, 2, 9, 0, 6, 8, 9, 2, 6, 1, 8, 3, 4, 0, 0, 1, 3, 9, 7, 8, 4, 8, 4, 5, 9, 9, 1, 3, 8, 5, 3, 2, 8, 5, 0, 1, 5, 6, 9, 5, 7, 6, 2, 4, 2, 8, 7, 3, 0, 4, 7, 0, 6, 6, 2, 4, 6, 4, 9, 1, 0, 9, 4, 2, 3, 9, 5, 3, 1, 8, 6, 9, 0, 5, 2, 9, 5, 5, 9, 7, 1, 9, 3, 7, 9, 0, 4, 6, 1, 6, 7, 8, 5, 3, 7, 9, 3, 9, 2, 6, 0, 4, 5, 9, 0, 0, 6, 7, 8, 5, 2, 6, 3, 5, 6, 2, 5, 6, 9, 1, 4, 9, 2, 8, 4, 3, 3, 7, 1, 7, 0, 1, 7, 7, 6, 9, 7, 2, 4, 7, 0, 8, 8, 0, 3, 1, 3, 3, 5, 2, 2, 1, 5, 7, 1, 6, 9, 1, 7, 4, 8, 8, 9, 7, 8, 1, 0, 0, 6, 2, 2, 1, 7, 0, 3, 9, 1, 2, 4, 4, 0, 3, 6, 0, 8, 2, 5, 8, 7, 5, 3, 2, 5, 1, 3, 7, 9, 3, 8, 9, 3, 4, 4, 7, 5, 0, 9, 2, 0, 3, 2, 7, 5, 4, 1, 0, 3, 9, 3, 4, 0, 1, 0, 7, 4, 1, 5, 1, 9, 8, 5, 1, 4, 9, 8, 6, 5, 0, 4, 3, 2, 8, 9, 3, 1, 6, 4, 7, 5, 2, 9, 7, 2, 3, 8, 8, 5, 7, 4, 3, 5, 3, 9, 4, 7, 9, 7, 2, 8, 3, 7, 1, 6, 6, 5, 1, 8, 2, 6, 1, 7, 7, 1, 2, 3, 8, 2, 4, 7, 5, 0, 8, 1, 0, 4, 8, 4, 8, 2, 2, 5, 7, 8, 8, 0, 6, 9, 5, 2, 4, 4, 1, 6, 7, 8, 1, 3, 1, 8, 6, 9, 8, 7, 3, 4, 6, 1, 2, 8, 0, 3, 1, 2, 6, 8, 0, 5, 4, 2, 5, 5, 5, 0, 7, 7, 0, 2, 6, 5, 8, 8, 9, 5, 5, 5, 6, 8, 9, 4, 1, 5, 3, 0, 7, 0, 8, 8, 4, 1, 4, 7, 2, 3, 5, 2, 2, 6, 3, 4, 2, 2, 7, 8, 1, 9, 8, 3, 6, 0, 3, 3, 4, 2, 3, 9, 0, 0, 9, 5, 8, 3, 9, 7, 9, 4, 5, 6, 2, 4, 5, 9, 2, 1, 3, 4, 7, 1, 6, 0, 4, 8, 0, 9, 9, 7, 5, 1, 4, 8, 0, 8, 8, 3, 9, 4, 5, 9, 4, 9, 4, 2, 6, 6, 0, 1, 8, 5, 4, 3, 3, 7, 0, 0, 0, 7, 9, 8, 4, 9, 3, 6, 9, 0, 7, 1, 8, 9, 6, 1, 2, 7, 9, 1, 6, 3, 9, 4, 1, 2, 0, 9, 0, 5, 7, 9, 4, 9, 9, 3, 1, 9, 9, 5, 2, 9, 5, 1, 0, 9, 1, 9, 9, 6, 2, 3, 3, 7, 3, 3, 0, 4, 5, 5, 6, 9, 9, 3, 2, 5, 5, 1, 5, 5, 3, 5, 6, 8, 2, 6, 9, 3, 1, 0, 9, 4, 8, 6, 2, 8, 0, 7, 8, 5, 1, 6, 8, 0, 3, 5, 7, 9, 1, 7, 6, 2, 7, 4, 4, 6, 6, 4, 7, 8, 2, 9, 3, 9, 9, 8, 7, 3, 2, 2, 9, 8, 8, 5, 0, 0, 3, 9, 1, 2, 5, 9, 3, 9, 8, 2, 5, 2, 2, 3, 7, 0, 1, 8, 5, 7, 1, 6, 0, 7, 1, 0, 6, 0, 3, 8, 7, 6, 2, 4, 3, 3, 0, 3, 6, 9, 4, 9, 3, 0, 8, 8, 6, 8, 5, 3, 3, 4, 3, 8, 9, 9, 1, 8, 1, 3, 8, 7, 1, 4, 0, 7, 4, 7, 8, 7, 6, 4, 0, 0, 2, 2, 0, 2, 1, 6, 9, 1, 5, 0, 5, 1, 1, 8, 1, 4, 5, 9, 4, 4, 6, 1, 2, 3, 5, 3, 1, 1, 3, 4, 6, 8, 4, 3, 8, 4, 7, 9, 4, 4, 2, 8, 6, 8, 5, 9, 9, 7, 0, 6, 8, 3, 4, 6, 4, 2, 7, 3, 5, 6, 6, 1, 2, 8, 8, 0, 9, 4, 6, 9, 6, 5, 6, 7, 9, 3, 8, 2, 0, 5, 6, 3, 2, 1, 7, 1, 2, 4, 3, 4, 5, 9, 1, 5, 7, 9, 0, 3, 5, 8, 1, 8, 4, 1, 8, 7, 5, 6, 2, 9, 1, 7, 3, 5, 3, 7, 4, 8, 6, 4, 6, 8, 9, 4, 6, 5, 1, 5, 2, 2, 5, 5, 6, 4, 3, 9, 6, 8, 8, 3, 6, 3, 7, 0, 1, 7, 0, 7, 7, 1, 2, 1, 6, 0, 0, 0, 0, 2, 3, 6, 0, 2, 5, 3, 4, 8, 0, 2, 6, 3, 6, 9, 6, 3, 9, 6, 2, 2, 0, 7, 6, 4, 0, 3, 7, 0, 6, 0, 5, 3, 9, 3, 6, 6, 2, 6, 5, 5, 9, 3, 8, 3, 7, 1, 5, 5, 1, 6, 2, 1, 4, 0, 7, 4, 7, 4, 7, 0, 4, 1, 0, 5, 6, 5, 7, 8, 6, 7, 5, 5, 6, 1, 8, 8, 6, 3, 6, 1, 4, 4, 6, 2, 4, 5, 0, 3, 3, 3, 4, 6, 7, 1, 8, 5, 1, 8, 8, 2, 2, 1, 4, 1, 1, 0, 0, 7, 1, 5, 7, 3, 1, 6, 4, 3, 8, 5, 3, 9, 9, 5, 3, 1, 8, 9, 6, 2, 6, 4, 0, 2, 8, 3, 2, 5, 2, 4, 0, 4, 6, 9, 8, 6, 8, 7, 7, 2, 0, 7, 0, 3, 3, 2, 9, 8, 9, 1, 5, 3, 7, 3, 9, 8, 4, 2, 5, 5, 3, 3, 1, 2, 1, 1, 9, 4, 5, 4, 0, 6, 6, 5, 5, 0, 8, 3, 6, 2, 8, 3, 3, 3, 9, 3, 3, 4, 9, 6, 7, 6, 0, 4, 8, 3, 9, 5, 8, 1, 6, 3, 3, 8, 4, 9, 3, 1, 9, 8, 3, 9, 9, 2, 4, 3, 6, 2, 7, 0, 2, 3, 1, 8, 3, 3, 2, 9, 4, 2, 9, 3, 7, 6, 2, 1, 3, 4, 5, 6, 6, 6, 4, 3, 3, 5, 8, 7, 7, 2, 5, 7, 1, 5, 0, 6, 3, 1, 1, 7, 6, 8, 7, 8, 3, 9, 1, 2, 4, 0, 0, 2, 0, 1, 3, 2, 6, 2, 7, 2, 7, 2, 0, 4, 5, 1, 5, 1, 6, 4, 5, 9, 4, 5, 8, 6, 9, 4, 8, 8, 3, 0, 9, 1, 7, 3, 1, 2, 3, 2, 4, 2, 7, 4, 4, 9, 4, 5, 5, 3, 9, 5, 7, 3, 0, 2, 4, 1, 9, 2, 8, 9, 2, 7, 9, 0, 0, 9, 7, 7, 0, 1, 1, 8, 3, 2, 1, 6, 1, 6, 0, 3, 6, 1, 6, 3, 2, 2, 2, 5, 9, 5, 7, 5, 2, 0, 8, 0, 9, 7, 0, 2, 0, 9, 1, 0, 3, 9, 0, 0, 3, 9, 2, 7, 0, 4, 3, 0, 8, 4, 3, 6, 3, 8, 3, 0, 2, 6, 8, 0, 9, 4, 6, 9, 3, 2, 8, 3, 1, 0, 9, 6, 0, 0, 9, 0, 9, 3, 7, 7, 2, 6, 1, 5, 6, 5, 3, 8, 8, 6, 0, 8, 6, 7, 5, 2, 7, 0, 1, 2, 7, 5, 3, 0, 7, 3, 3, 6, 8, 2, 7, 3, 1, 4, 5, 5, 2, 0, 3, 2, 1, 6, 0, 5, 9, 4, 9, 8, 3, 8, 3, 2, 3, 6, 4, 7, 2, 3, 2, 2, 7, 0, 7, 9, 5, 1, 2, 5, 6, 8, 9, 1, 7, 3, 9, 1, 0, 8, 7, 0, 3, 9, 6, 2, 8, 4, 3, 5, 7, 4, 1, 6, 6, 0, 8, 7, 1, 9, 1, 8, 9, 4, 5, 1, 9, 2, 5, 4, 9, 3, 5, 3, 0, 7, 5, 6, 2, 5, 4, 7, 6, 1, 5, 3, 0, 2, 6, 5, 8, 9, 4, 5, 8, 5, 4, 8, 8, 9, 7, 6, 5, 3, 5, 2, 8, 4, 1, 5, 7, 5, 6, 5, 8, 8, 4, 5, 1, 5, 4, 3, 8, 1, 5, 6, 9, 9, 1, 0, 2, 5, 6, 6, 7, 3, 5, 5, 2, 6, 6, 0, 4, 1, 1, 1, 2, 5, 4, 1, 2, 0, 1, 9, 2, 5, 2, 0, 9, 0, 7, 4, 7, 2, 5, 9, 3, 0, 5, 6, 7, 9, 7, 2, 9, 8, 0, 7, 4, 0, 5, 4, 7, 7, 8, 1, 6, 8, 2, 2, 9, 8, 2, 6, 5, 1, 2, 0, 7, 9, 5, 3, 6, 9, 0, 0, 3, 2, 2, 6, 1, 7, 1, 4, 5, 6, 6, 5, 6, 2, 4, 2, 4, 7, 8, 1, 1, 2, 4, 1, 6, 4, 9, 2, 8, 7, 7, 0, 9, 8, 4, 8, 1, 6, 9, 2, 3, 6, 7, 7, 4, 6, 2, 2, 5, 9, 6, 2, 5, 9, 7, 5, 6, 7, 3, 3, 2, 0, 2, 7, 2, 2, 1, 1, 3, 2, 3, 4, 8, 6, 8, 5, 4, 0, 8, 7, 7, 4, 0, 0, 7, 0, 3, 6, 3, 8, 7, 1, 9, 8, 5, 2, 5, 0, 7, 9, 7, 7, 4, 6, 4, 1, 2, 3, 1, 2, 0, 8, 9, 5, 8, 4, 4, 2, 2, 1, 7, 6, 5, 0, 9, 1, 7, 2, 6, 8, 7, 7, 5, 9, 6, 2, 2, 1, 1, 6, 4, 6, 2, 1, 2, 1, 8, 7, 1, 7, 0, 2, 9, 0, 0, 6, 4, 7, 9, 1, 2, 3, 4, 9, 2, 2, 8, 5, 0, 6, 2, 5, 2, 8, 2, 8, 3, 2, 3, 5, 1, 3, 4, 2, 5, 9, 0, 0, 3, 9, 0, 4, 9, 8, 5, 3, 9, 3, 9, 5, 4, 0, 9, 9, 2, 1, 7, 2, 7, 0, 8, 1, 7, 7, 5, 6, 6, 9, 4, 9, 4, 1, 4, 3, 1, 9, 8, 3, 5, 8, 1, 6, 7, 8, 7, 1, 9, 1, 3, 1, 7, 5, 5, 0, 6, 3, 4, 0, 9, 6, 4, 0, 6, 4, 3, 1, 5, 0, 9, 2, 5, 6, 8, 4, 3, 4, 1, 8, 1, 0, 8, 8, 7, 3, 9, 1, 5, 5, 0, 6, 1, 2, 2, 8, 0, 6, 5, 4, 5, 5, 5, 5, 6, 5, 1, 0, 0, 5, 9, 0, 1, 9, 3, 4, 0, 0, 8, 4, 0, 6, 5, 6, 1, 7, 6, 7, 1, 0, 4, 6, 6, 3, 5, 9, 6, 1, 5, 1, 6, 6, 8, 2, 3, 8, 6, 0, 1, 3, 1, 7, 1, 1, 2, 0, 5, 9, 3, 2, 4, 0, 5, 2, 5, 2, 3, 5, 2, 2, 2, 1, 4, 2, 1, 2, 5, 9, 5, 5, 1, 7, 6, 3, 2, 2, 6, 8, 7, 5, 8, 8, 5, 4, 1, 1, 0, 1, 9, 2, 6, 7, 1, 3, 4, 3, 1, 9, 1, 7, 7, 2, 9, 4, 3, 1, 4, 6, 0, 6, 9, 2, 6, 9, 2, 6, 8, 8, 5, 1, 9, 0, 4, 5, 3, 9, 5, 6, 3, 2, 1, 8, 2, 9, 8, 5, 3, 7, 1, 7, 0, 5, 4, 6, 8, 5, 5, 5, 9, 4, 7, 9, 2, 0, 3, 1, 3, 4, 7, 2, 4, 3, 9, 7, 8, 6, 5, 8, 1, 0, 8, 3, 3, 5, 8, 9, 7, 1, 7, 9, 5, 6, 4, 6, 5, 7, 0, 9, 8, 8, 1, 6, 5, 1, 5, 5, 2, 9, 8, 5, 6, 2, 1, 0, 3, 7, 5, 6, 6, 3, 9, 2, 3, 8, 1, 2, 1, 2, 2, 9, 9, 1, 8, 2, 9, 4, 8, 8, 3, 0, 4, 1, 3, 9, 4, 1, 5, 8, 3, 4, 4, 3, 0, 5, 8, 2, 1, 8, 6, 2, 8, 0, 7, 5, 0, 4, 4, 6, 4, 1, 0, 6, 1, 8, 6, 3, 9, 5, 9, 2, 5, 8, 4, 1, 4, 6, 0, 9, 4, 2, 0, 8, 7, 4, 5, 0, 5, 4, 2, 7, 4, 2, 9, 6, 4, 2, 6, 8, 2, 8, 3, 1, 7, 8, 2, 8, 0, 6, 9, 9, 1, 5, 5, 4, 5, 5, 8, 2, 7, 6, 3, 6, 9, 9, 5, 3, 6, 8, 8, 5, 9, 1, 3, 4, 5, 0, 7, 4, 4, 3, 8, 4, 1, 8, 5, 0, 0, 7, 0, 1, 5, 1, 4, 4, 5, 0, 4, 9, 8, 6, 1, 9, 1, 4, 0, 0, 8, 9, 5, 1, 7, 9, 0, 0, 1, 2, 0, 1, 0, 7, 1, 1, 3, 3, 2, 7, 0, 1, 9, 5, 9, 9, 6, 9, 2, 2, 5, 7, 1, 4, 3, 6, 2, 5, 8, 1, 8, 5, 2, 2, 7, 9, 5, 7, 4, 3, 3, 5, 6, 6, 0, 8, 7, 0, 3, 8, 0, 5, 1, 2, 2, 2, 9, 1, 7, 4, 8, 8, 4, 3, 0, 8, 3, 5, 7, 9, 1, 5, 7, 3, 3, 0, 2, 8, 4, 4, 4, 1, 3, 0, 1, 3, 5, 1, 7, 3, 8, 1, 5, 6, 5, 6, 7, 2, 7, 0, 0, 4, 3, 0, 0, 6, 8, 1, 4, 8, 8, 2, 7, 2, 4, 5, 3, 6, 1, 5, 8, 1, 5, 1, 4, 1, 2, 0, 1, 9, 8, 1, 2, 2, 0, 1, 5, 9, 6, 9, 6, 0, 8, 8, 8, 8, 6, 4, 9, 7, 0, 5, 2, 6, 0, 0, 6, 8, 9, 7, 7, 0, 7, 2, 3, 8, 0, 3, 4, 3, 8, 3, 4, 7, 1, 4, 7, 1, 8, 5, 0, 4, 1, 1, 4, 4, 8, 3, 6, 9, 6, 4, 9, 0, 1, 1, 9, 9, 2, 4, 6, 3, 6, 1, 4, 3, 6, 3, 2, 5, 8, 4, 9, 4, 7, 7, 2, 7, 0, 3, 6, 3, 2, 6, 8, 7, 6, 0, 8, 1, 4, 9, 2, 6, 6, 0, 1, 1, 4, 7, 1, 6, 4, 2, 5, 4, 5, 7, 7, 5, 4, 4, 7, 3, 2, 7, 2, 7, 9, 4, 7, 4, 6, 5, 2, 3, 8, 4, 9, 2, 1, 6, 9, 4, 7, 1, 2, 0, 8, 7, 0, 4, 1, 2, 4, 3, 8, 2, 6, 7, 5, 8, 9, 7, 4, 3, 8, 0, 5, 7, 4, 6, 4, 6, 8, 0, 8, 3, 7, 9, 3, 8, 7, 2, 4, 9, 5, 5, 2, 9, 9, 0, 4, 0, 7, 1, 1, 9, 4, 0, 3, 8, 4, 4, 7, 0, 4, 0, 9, 6, 5, 1, 1, 7, 4, 1, 4, 9, 3, 9, 3, 2, 3, 5, 4, 7, 8, 5, 5, 6, 6, 3, 9, 5, 0, 2, 0, 6, 2, 7, 0, 9, 4, 8, 9, 0, 3, 1, 5, 6, 4, 2, 0, 9, 9, 7, 8, 6, 8, 8, 8, 4, 6, 3, 6, 5, 9, 0, 2, 8, 9, 6, 9, 9, 2, 8, 2, 3, 4, 8, 3, 7, 8, 1, 3, 3, 9, 1, 5, 8, 2, 2, 0, 9, 7, 6, 9, 0, 0, 2, 6, 2, 1, 6, 1, 2, 0, 9, 7, 3, 6, 6, 7, 2, 9, 0, 1, 5, 4, 3, 0, 1, 8, 9, 2, 6, 1, 4, 8, 1, 3, 8, 2, 0, 5, 0, 5, 5, 5, 1, 8, 4, 9, 9, 4, 6, 8, 3, 6, 1, 8, 9, 4, 5, 1, 2, 1, 0, 8, 0, 6, 5, 4, 1, 4, 9, 8, 1, 2, 1, 7, 9, 1, 3, 1, 4, 3, 7, 0, 5, 8, 9, 2, 7, 8, 0, 3, 1, 2, 8, 5, 5, 5, 9, 3, 3, 6, 4};

        System.out.println(solution.checkSubarraySum(nums, 3));
//        System.out.println(solution.checkSubarraySum(nums1, 3092));
    }

    @Test
    void getIntersectionNode() {
        OperateList operateList = new OperateList();
        int[] a = {4, 1, 8, 4, 5};
        int[] b = {5, 0, 1, 8, 4, 5};
        ListNode headA = operateList.buildTree(a);
        ListNode headB = operateList.buildTree(b);
        ListNode node = solution.getIntersectionNode(headA, headB);
        System.out.println(node);
    }

    @Test
    void findMaxLength() {
        int[] nums = {0, 1, 0};
        System.out.println(solution.findMaxLength(nums));
    }

    @Test
    void findTargetSumWays() {
        int[] nums = {1};
        System.out.println(solution.findTargetSumWays(nums, 1));
    }

    @Test
    void nextGreaterElement() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
    }

    @Test
    void getHint() {
        String secret = "1123";
        String guess = "0111";
        System.out.println(solution.getHint(secret, guess));
    }

    @Test
    void convert() {
        String s1 = "PAYPALISHIRING";
        String s = "A";
        int numRows = 1;
        System.out.println(solution.convert(s, numRows));
    }
}