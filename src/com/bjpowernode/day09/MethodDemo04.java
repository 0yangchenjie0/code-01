package com.bjpowernode.day09;

/**
 * 判断程序的运行结果
 */
public class MethodDemo04 {

    public static void main(String[] args) {
        int[] arr = {1,2};
        m1(arr);
        System.out.println("main.arr[0]:" + arr[0]); // 1
    }

    static void m1(int[] arr) {
        int[] array = {100,200};
        arr = array; // 将新的地址赋值给了 arr
        System.out.println("m1.arr[0]:" + arr[0]); // 100
    }
}
