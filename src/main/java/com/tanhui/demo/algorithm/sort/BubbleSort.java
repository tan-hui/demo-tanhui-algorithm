package com.tanhui.demo.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 14:19
 */
public class BubbleSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
