package com.bjpowernode.day08;

/**
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 * at com.bjpowernode.day08.ArrayDemo03.main(ArrayDemo03.java:17)
 * <p>
 * 数组下标越界
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        // 定义一个长度为3的字符数组
        char[] arr = new char[3];

        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        // arr[3] = 'd'; // ArrayIndexOutOfBoundsException

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(arr[3]); ArrayIndexOutOfBoundsException

        // 通过length属性来获取数组的长度
        System.out.println("数组的长度：" + arr.length);
        System.out.println("数组的最后一个元素：" + arr[arr.length - 1]);
    }
}
