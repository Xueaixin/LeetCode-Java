package com.algorithm;

public class Sort {
    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    int partition(int[] array, int begin, int end) {
        int index = begin + 1;
        for(int i = begin + 1; i <= end; i++) {
            if(array[i] <= array[begin]) {
                swap(array, index, i);
                index++;
            }
        }
        swap(array, index - 1, begin);
        return index - 1;
    }

    public void quickSort(int[] array, int begin, int end) {
        if(begin < end) {
            int pivotIndex = partition(array, begin, end);
            quickSort(array, begin, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    void merge(int[] array, int begin, int end, int mid) {
        int left = begin;
        int right = mid + 1;
        int len = end - begin + 1;
        int[] temp = new int[end - begin + 1];
        for(int i = 0; i < len; i++) {
            if(right > end || (left <= mid && array[left] < array[right])) {
                temp[i] = array[left];
                left++;
            }
            else {
                temp[i] = array[right];
                right++;
            }
        }
        for(int i = 0; i < len; i++) {
            array[i + begin] = temp[i];
        }
    }

    public void mergeSort(int[] array, int begin, int end) {
        if(begin < end) {
            int mid = (begin + end) / 2;
            mergeSort(array, begin, mid);
            mergeSort(array, mid + 1, end);
            merge(array, begin, end, mid);
        }
    }

    void buildMaxHeap(int[] array) {
        int mid = array.length / 2 - 1;
        for(int i = mid; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
    }

    void adjustHeap(int[] array, int index, int len) {
        int left = index * 2 + 1;
        int right = left + 1;
        int largest = index;
        if(left < len && array[left] > array[largest]) {
            largest = left;
        }
        if(right < len && array[right] > array[largest]) {
            largest = right;
        }
        if(largest != index) {
            swap(array, index, largest);
            adjustHeap(array, largest, len);
        }
    }

    public void heapSort(int[] array) {
        buildMaxHeap(array);
        int len = array.length;
        for(int i = len - 1; i > 0; i--) {
            swap(array, 0, i);
            len--;
            adjustHeap(array, 0, len);
        }
    }
}
