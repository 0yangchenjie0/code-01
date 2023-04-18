package com.bjpowernode.day09;

/**
 * 需求：获取元素59在数组{5, 12, 90, 18, 77, 76, 45, 28, 59, 72, 59}中的索引。
 * <p>
 * 分析：遍历数组，将59和数组中每个元素比较大小，
 * 如果相等，返回该元素的索引，
 * 如果要查找的元素在数组中不存在，返回 -1
 * <p>
 * 注意：如果一个元素在数组中出现多次，返回第一个位置的索引
 * <p>
 * <p>
 * 需求：将数组元素反转，原数组{5, 12, 90, 18, 77, 76, 45, 28, 59, 72}，
 * 反转后为{72, 59, 28, 45, 76, 77, 18, 90, 12, 5}。
 * <p>
 * 引入一个外部数组变量，用于保存反序后的数组，然后把原数组中的元素倒序保存于新创建的数组中。
 */
public class ArrayDemo04 {

    public static void main(String[] args) {

        int[] arr = {5, 12, 90, 20, 18, 77, 10};

        print(arr);
        // 不创建新的数组，直接对数组中的元素进行首尾交换
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println();
        print(arr);


        // 获取反转后的数组
        // int[] rarr = reverseArray(arr);
        // 输出反转后的结果
        // print(rarr);
        // print(reverseArray(arr));

//        // 数组中的最大值
//        int maxValue = getMaxValue(arr);
//        System.out.println("maxValue = " + maxValue);
//
//        // 最大值的索引
//        int maxVauleIndex = getIndex(maxValue, arr);
//        System.out.println("maxValue.index = " + maxVauleIndex);
    }


    static int[] reverseArray(int[] arr) {
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
    static void print(int[] arr) {
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
    static int getMaxValue(int[] arr) {
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
    static int getIndex(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 找到了满足条件的第一个元素
            if (value == arr[i]) {
                return i; // 返回索引值 在循环中遇到return，后续循环也不在执行，方法提前结束
            }
        }
        // 如果value在数组中不存在，返回-1
        return -1;
    }
}
