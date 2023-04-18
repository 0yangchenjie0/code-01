package com.bjpowernode.day09;

/**
 * 需求：获取数组{5, 12, 90, 18, 77, 76, 45, 28, 59, 72}的最大值。
 * <p>
 * 思路：
 * 1.初始化数组
 * 2.首先取出数组的第一个元素，假设第一个元素就是最大值
 * 3.maxValue 依次和数组后续的元素比较大小
 * if(arr[i] > maxValue) {
 * maxValue = arr[i];
 * }
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //1.初始化数组
        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};
        //2.假设第一个元素是最大值
        int maxValue = arr[0]; // 5
        //3.从第二个元素遍历数组
        for (int i = 1; i < arr.length; i++) {
            // System.out.println(arr[i]);
            // 将 maxValue 和 arr[i] 比较大小，如果 maxValue < arr[i] ,maxValue = arr[i]
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("maxValue = " + maxValue);
    }
}

// 第1次循环 maxValue == 5    maxValue == 12
// 第2次循环 maxValue == 12   maxValue == 90
// 第3次循环 maxValue == 90   maxValue == 90
// 第4次循环 maxValue == 90   maxValue == 90
