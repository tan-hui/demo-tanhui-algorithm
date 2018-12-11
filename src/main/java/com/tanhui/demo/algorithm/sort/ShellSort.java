package com.tanhui.demo.algorithm.sort;

/**
 * 希尔排序
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 15:04
 */
public class ShellSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > temp) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = temp;
            }
            gap = gap / 2;
        }
        return arr;
    }
}
