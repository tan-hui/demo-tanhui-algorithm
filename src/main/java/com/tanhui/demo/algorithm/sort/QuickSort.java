package com.tanhui.demo.algorithm.sort;

import java.util.Random;

/**
 * 快排
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/7 18:49
 */
public class QuickSort {
    private static Random random = new Random();

    public static void sort(int[] arr, int _leftIndex, int _rightIndex) {
        if (arr.length < 1 || _leftIndex < 0 || _rightIndex >= arr.length || _leftIndex > _rightIndex) {
            return;
        }
        int leftIndex = _leftIndex;
        int rightIndex = _rightIndex;
        //随机设定基准位置
        int pivotIndex = leftIndex + (random.nextInt(rightIndex - leftIndex + 1));
        //将基准位置 与leftIndex 交换位置
        swap(arr, leftIndex, pivotIndex);
        //基准数
        int pivot = arr[leftIndex];
        while (leftIndex < rightIndex) {
            //右指针左移,从右往左扫描，找到第一个比基准元素小的元素
            while (arr[rightIndex] > pivot && rightIndex > leftIndex) {
                rightIndex--;
            }
            arr[leftIndex] = arr[rightIndex];

            //左指针右移,从左往右扫描，找到第一个比基准元素大的元素
            while (arr[leftIndex] <= pivot && rightIndex > leftIndex) {
                leftIndex++;
            }
            arr[rightIndex] = arr[leftIndex];
        }
        //基准元素归位
        arr[rightIndex] = pivot;
        sort(arr, _leftIndex, leftIndex - 1);
        sort(arr, rightIndex + 1, _rightIndex);
    }


    //交互数组元素位置
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
