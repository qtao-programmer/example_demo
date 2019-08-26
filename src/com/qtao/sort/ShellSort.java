package com.qtao.sort;

import java.util.Arrays;

/**
 * @ClassNames ShellSort
 * @Description 希尔排序法
 * @Author qtao
 * @Date 2019/8/26 15:26
 * Version 1.0
 **/
public class ShellSort {

    public static void main(String[] args) {
        shellSort();
    }

    public static void shellSort(){
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 对数组元素进行分组
            for (int i = gap; i < arr.length; i++) {
                // 遍历各组中的元素
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 交换元素
                    if (arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}

/**

 希尔排序(Shell’s Sort)是插入排序的一种又称“缩小增量排序”（Diminishing Increment Sort），是直接插入排序算法的一种更高效的改进版本。
 希尔排序是非稳定排序算法。该方法因D.L.Shell于1959年提出而得名。
 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，
 整个文件恰被分成一组，算法便终止。
 --------------------------------------
 详细博文：https://blog.csdn.net/qq_42453117/article/details/99680831

**/