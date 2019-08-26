package com.qtao.sort;

import java.util.Arrays;

/**
 * @ClassNames InsertionSort
 * @Description 插入排序
 * @Author qtao
 * @Date 2019/8/26 15:21
 * Version 1.0
 **/
public class InsertionSort {

    public static void main(String[] args) {
        insertionSort();
    }

    public static void insertionSort(){
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        for (int i = 1; i < arr.length; i++) {
            // 定义待插入的数
            int insertValue = arr[i];
            // 找到待插入数的前一个数的下标
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
        System.out.println(Arrays.toString(arr));
    }

}

/**

 插入排序（Insertion sort）是一种简单直观且稳定的排序算法。如果有一个已经有序的数据序列，要求在这个已经排好的数据序列中插入一个数，
 但要求插入后此数据序列仍然有序，这个时候就要用到一种新的排序方法——插入排序法,插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
 从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，时间复杂度为O(n^2)。是稳定的排序方法。插入算法把要排序的数组分成两部分：
 第一部分包含了这个数组的所有元素，但将最后一个元素除外（让数组多一个空间才有插入的位置），而第二部分就只包含这一个元素（即待插入元素）。
 在第一部分排序完成后，再将这个最后元素插入到已排好序的第一部分中。
 插入排序的基本思想是：每步将一个待排序的记录，按其关键码值的大小插入到前面已经排序的数组中的适当位置上，直到全部插入完为止。
 -----------------------------------
 详细博文：https://blog.csdn.net/qq_42453117/article/details/99680831

 **/