package com.bjpowernode.day08;

/**
 * foreach 案例
 * 1.定义一个数组，内容 [1,10]
 * 2.计算数组中所有元素的和
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 使用增强for循环遍历数组
        for (int value : arr) { // 每次循环从数组中按下标顺序获取一个元素，赋值给变量 value
            System.out.println(value);
        }
    }
}
