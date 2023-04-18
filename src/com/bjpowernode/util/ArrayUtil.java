package com.bjpowernode.util;

/**
 * 数组工具类
 */
public abstract class ArrayUtil {

    // ArrayUtil util = new ArrayUtil();

    /**
     * 数组反转
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr) {
        // 对数组的内容做反转
        // 定义一个数组，存储反转后的结果
        int[] rarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rarr[arr.length - 1 - i] = arr[i];
        }
        // 返回反转后的结果
        return rarr;
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


    /**
     * 获取数组的最大值
     *
     * @param arr
     * @return
     */
    public static int getMaxValue(int[] arr) {
        // 假设第一个元素就是最大值
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    /**
     * 根据元素的值获取该元素在数组中的索引(下标)
     *
     * @param value 元素的值
     * @param arr   要查找的数组
     * @return 目标元素的下标
     */
    public static int getIndex(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 找到了满足条件的第一个元素
            if (value == arr[i]) {
                return i; // 返回索引值 在循环中遇到return，后续循环也不在执行，方法提前结束
            }
        }
        // 如果value在数组中不存在，返回-1
        return -1;
    }

    /**
     * 删除数组中的元素
     * 【1,2,3,5】
     * @param value 元素值
     * @param arr   数组
     */
    public static void removeElement(int value, int[] arr) {
        int index = ArrayUtil.getIndex(value, arr);
        if (index > 0) {
            // 找到了需要删除的元素
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
    }
}
