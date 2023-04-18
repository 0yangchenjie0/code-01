package com.bjpowernode.day10;

import java.util.Arrays;

/**
 * 定义一个长度为2的二维数组
 * 每个元素的长度为3
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        // 给二维数组赋值
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // 打印每个二维数组的元素
        int[] arr0 = arr[0];
        System.out.println(Arrays.toString(arr0));

        int[] arr1 = arr[1];
        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------");
        // 二维数组遍历
        // 外层循环遍历二维数组中的元素
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(Arrays.toString(arr[i]));
            // 内存循环遍历每个元素位置上的一维数组
            for (int j=0;j< arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
