package com.tanhui.demo.algorithm.sort;

/**
 * 选择排序
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 12:04
 */
public class SelectionSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
