package com.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {
    private Sort sort;

    @BeforeEach
    void setUp() {
        sort = new Sort();
    }

    @Test
    void quickSort() {
//        int[] array = {6, 11, 8, 2, 9, 4, 1, 5, 7, 10, 3};
        int[] array = {6, 8, 8, 2, 6, 4, 9, 5, 7};
        sort.quickSort(array, 0, array.length - 1);
    }

    @Test
    void mergeSort() {
        int[] array = {6, 11, 8, 2, 9, 4, 1, 5, 7, 10, 3};
        sort.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void heapSort() {
        int[] array = {6, 11, 8, 2, 9, 4, 1, 5, 7, 10, 3};
        sort.buildMaxHeap(array);
//        sort.heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}