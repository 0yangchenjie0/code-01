package com.bjpowernode.day09;

/**
 * 数组的内存结构
 *
 * jvm 内存划分：
 *   栈内存
 *      方法运行时的数据存储在栈内存，先进后出
 *      方法的入栈
 *      方法的出栈
 *   堆内存
 *      创建的数组、对象的数据存储在堆内存
 */
public class ArrayDemo02 {

    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        // arr[3] = 400; // 数组下标越界异常 ArrayIndexOutOfBoundsException

        // arr = null;
        // System.out.println(arr[0]);// 空指针异常 NullPointerException

        int[] arr2 = arr;
        arr2[0] = 1024;
        System.out.println(arr[0]); //1024
        System.out.println(arr2[0]);//1024
    }
}
