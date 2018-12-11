package com.tanhui.demo.algorithm.sort;

/**
 * 插入排序
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 12:03
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > current) {
                    arr[j + 1] = arr[j];
                    arr[j] = current;
                }
            }
        }
        return arr;
    }

    public static int[] sort2(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int temp = arr[i];
            while (preIndex >= 0 && arr[preIndex] > temp) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = temp;
        }

        return arr;
    }
}
