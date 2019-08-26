package com.qtao.sort;

import java.util.Arrays;

/**
 * @ClassNames SelectiveSort
 * @Description 选择排序法
 * @Author qtao
 * @Date 2019/8/26 15:11
 * Version 1.0
 **/
public class SelectiveSort {

    public static void main(String[] args) {
        selectiveSort();
    }

    public static void selectiveSort(){
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// 保存最小元素的下标
                }
            }
            // 此时已经找到最小元素的下标
            // 将最小元素与前面的元素交换
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
/**

 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是：第一次从待排序的数据元素中选出最小（或最大）的一个元素，
 存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。以此类推，
 直到全部待排序的数据元素的个数为零。选择排序是不稳定的排序方法。
 -----------------------------------------------------------
 详细博客：https://blog.csdn.net/qq_42453117/article/details/99680831

 **/