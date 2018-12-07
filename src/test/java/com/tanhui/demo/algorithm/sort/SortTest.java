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
    int[] arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4};

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.err.print(i);
        }
    }

    @Test
    public void testInsertionSort() {
        int[] sortedArr = InsertionSort.sort(arr);
        printArr(sortedArr);

    }
    @Test
    public void testSelectionSort() {
        int[] sortedArr = SelectionSort.sort(arr);
        printArr(sortedArr);
    }
}
