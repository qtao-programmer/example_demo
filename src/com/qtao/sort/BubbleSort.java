package com.qtao.sort;

import java.util.Arrays;

/**
 * @ClassNames BubbleSort
 * @Description 冒泡排序法
 * @Author qtao
 * @Date 2019/8/26 15:03
 * Version 1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort(){
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        // 统计比较次数
        int count = 0;
        // 第一轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 第二轮比较
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                count++;
            }
            if(flag)
                break;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了:" + count + "次");
    }

}
/**
 冒泡排序（Bubble Sort），是一种较简单的排序算法。
 它重复地走访过要排序的元素列，依次比较两个相邻的元素，如果他们的顺序（如从大到小、首字母从A到Z）错误就把他们交换过来。走访元素的工作
 是重复地进行直到没有相邻元素需要交换，也就是说该元素列已经排序完成。
 这个算法的名字由来是因为越大的元素会经由交换慢慢“浮”到数列的顶端（升序或降序排列），就如同碳酸饮料中二氧化碳的气泡最终会上浮到顶端一样，故名“冒泡排序”。
 ------------------------------------------------------------------------
 详细博客：https://blog.csdn.net/qq_42453117/article/details/99680831
 **/