package com.tests;

import com.objects.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array1));
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
    void test() {
        String str = "gr";
        String res = String.format("%-5s", str.charAt(0));
        res = res.replace(' ', '1');
        System.out.println(res);
    }

    @Test
    void largestNumber() {
//        int[] nums = {3, 30, 34, 5, 9};
        int[] nums = {0, 0};
        System.out.println(solution.largestNumber(nums));
    }
}