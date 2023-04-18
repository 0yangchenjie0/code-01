package com.bjpowernode.day08;

/**
 * 需求：初始化一个数组，存储1-100，100个元素,并且打印输出每个元素
 * 分析
 * 数组的长度是100
 * 数组存储的数据类型是int
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        // 定义一个int类型的数组，长度是100
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            // 给数组赋值
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
}
