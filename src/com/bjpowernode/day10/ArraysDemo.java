package com.bjpowernode.day10;

import java.util.Arrays;

/**
 * 被static关键字修饰的方法称为 静态方法
 * 可以使用 类名.方法名称() 调用静态方法
 * ArrayUtil.print(arr);
 * <p>
 * public static String toString(Type[] arr) ，返回指定数组内容的字符串表示形式。
 * public static boolean equals(Type[] arr1, Type[] arr2)， 判断两个数组中的内容是否相同。元素的个数和顺序一致
 * public static void sort(Type[] arr) ，对数组中的内容进行升序排序。
 * <p>
 * <p>
 * public static int binarySearch(Type[] arr, Type key)
 * 查找 key 在数组中的索引位置。如果找到，则返回索引位置；如果没找到，则返回一个负数。
 * 注意：在调用此调用之前，必须先对数组进行排序。
 * <p>
 * public static void fill(Type[] arr, Type val)，给数组填充指定内容。
 * public static Type [] copyOf(Type[] original, Type newLength)`
 * 从数组的第一个元素开始拷贝，拷贝指定长度的数组，拷贝完成返回一个新的数组。
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // ArrayUtil.print(arr);
        // 打印输出数组的内容
        String str = Arrays.toString(arr);
        System.out.println(str); // [1, 2, 3, 4, 5]


        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};
        // 比较两个数组是否相同
        System.out.println(Arrays.equals(arr1, arr2));


        // 对数组元素进行排序
        int[] arr3 = {10, 1, 3, 7, 6, 9, 7};
        // 排序 由小到大排序
        Arrays.sort(arr3); // 引用数据类型作为方法的参数，传递的该参数的地址
        // 输出排序后的结果
        System.out.println(Arrays.toString(arr3));

        // 二分查找元素7的下标
        System.out.println(Arrays.binarySearch(arr3, 7));

        int[] arr4 = new int[10];
        Arrays.fill(arr4, 100);
        System.out.println(Arrays.toString(arr4));

        System.out.println("-------------------");
        // copy 数组
        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
}
