package com.tanhui.demo.algorithm.sort;

/**
 * 堆排序
 *
 * @author tanhui
 * @email hui_tan@sui.com
 * @date 2018/12/8 17:50
 */
public class HeapSort {

    public static void sort(int[] arr) {
        //堆初始化
        makeMinHeap(arr, arr.length);
        for (int i = arr.length - 1; i >= 1; i--) {
            swap(arr, 0, i);
            maxHeapFixDown(arr, 0, i);
        }

    }

    /**
     * 新加入i结点
     *
     * @param arr 堆数组
     * @param i   加入的索引
     */
    public static void maxHeapFixup(int[] arr, int i) {
        //父节点索引
        int j = (i - 1) / 2;
        //加入节点的值
        int temp = arr[i];
        while (j >= 0 && i != 0 && arr[j] < temp) {
            //父节点下移
            arr[i] = arr[j];
            i = j;
            j = (j - 1) / 2;
        }
        arr[i] = temp;
    }


    /**
     * 从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2
     *
     * @param arr 堆数组
     * @param i   开始调整的节点
     * @param n   堆节点数
     */
    public static void maxHeapFixDown(int[] arr, int i, int n) {
        //待调整节点的数值
        int temp = arr[i];
        //左孩子节点索引
        int j = 2 * i + 1;
        while (j < n) {
            //左右孩子节点中找最大的
            if (j + 1 < n && arr[j + 1] > arr[j]) {
                j++;
            }
            if (arr[j] <= temp) {
                break;
            }
            //把较大的孩子节点往上移动,替换父节点
            arr[i] = arr[j];
            i = j;
            j = 2 * i + 1;
        }
        arr[i] = temp;
    }

    /**
     * 在最大堆中删除数
     *
     * @param arr 堆数组
     * @param n   堆节点数
     */
    public static void maxHeapDeleteNumber(int[] arr, int n) {
        swap(arr, 0, n - 1);
        maxHeapFixDown(arr, 0, n - 1);
    }

    public static void makeMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapFixDown(arr, i, n);
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
