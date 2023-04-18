package com.bjpowernode.day08;

public class JVMDemo04 {
    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = arr1; // 两个数组引用的是相同的堆内存中的数据
//        arr1[2] = 33;
//        System.out.println(arr1[2]); // 3
//        System.out.println(arr2[2]); // 3


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1; // 两个数组引用的是相同的堆内存中的数据
        arr1 = null;

        System.out.println(arr2[2]); // 3
        // System.out.println(arr1[2]); //  NullPointerException
    }
}
