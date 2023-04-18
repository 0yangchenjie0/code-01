package com.bjpowernode.day08;

/**
 *
 */
public class ArrayDemo02 {
    public static void main(String[] args) {

        // 1.创建数组的时候，直接赋值
        int[] arr1 = {1,2,3};


        // 2.只创建数组不赋值
        String[] arr2 = new String[4];

        // 3.给数组元素赋值
        arr2[0] = "A";
        arr2[1] = "B";
        arr2[2] = "C";
        arr2[3] = "D";

        // 改变数组元素的内容
        arr1[1] = 200;
        arr2[2] = "hello";

        // 4.获取数组元素的值
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("------------------");

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);


    }
}
