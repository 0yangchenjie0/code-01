package com.bjpowernode.day09;

/**
 * 1.数组的定义
 *   动态创建数组
 *   静态创建数组
 * 2.赋值、取值、遍历
 * 3.数组初始化的默认值
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        // 动态创建数组
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);// 0
        System.out.println(arr1[1]);// 0
        System.out.println(arr1[2]);// 0

        // 静态创建数组
        // int[] arr2 = new int[] {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(arr2[0]);//1
        System.out.println(arr2[1]);//2
        System.out.println(arr2[2]);//3


        // 通过下标给数组赋值
        arr2[2] = 200;
        System.out.println(arr2.length); // 获取数组的长度

        System.out.println("---------------");
        // 数组的遍历
        for (int i=0; i<=arr2.length -1;i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("---------------");
        for (int value: arr2) {
            System.out.println(value);
        }
    }
}
