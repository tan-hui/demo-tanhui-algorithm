package com.tanhui.demo.algorithm.sort;


import org.junit.Test;

/**
 * 排序测试类
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 12:07
 */

public class SortTest {
    int[] arr = new int[]{10, 5, 3, 1, 7, 2, 8};

    private static void printArr(int[] arr, String msg) {
        System.err.print(msg);
        for (int i : arr) {
            System.err.print(i);
        }
        System.err.println();
    }

    @Test
    public void testHeapSort() {
        printArr(arr, "排序前:");
        HeapSort.sort(arr);
        printArr(arr, "排序后:");
    }

    @Test
    public void testQuickSort() {
        printArr(arr, "排序前:");
        QuickSort.sort(arr, 0, arr.length - 1);
        printArr(arr, "排序后:");
    }

    @Test
    public void testInsertionSort() {
        printArr(arr, "排序前:");
        int[] sortedArr = InsertionSort.sort(arr);
        printArr(arr, "排序后:");

    }

    @Test
    public void testSelectionSort() {
        printArr(arr, "排序前:");
        int[] sortedArr = SelectionSort.sort(arr);
        printArr(arr, "排序后:");
    }

    @Test
    public void testBubbleSort() {
        printArr(arr, "排序前");
        int[] sortedArr = BubbleSort.sort(arr);
        printArr(arr, "排序后");
    }
}
