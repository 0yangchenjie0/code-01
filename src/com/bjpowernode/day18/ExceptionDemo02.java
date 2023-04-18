package com.bjpowernode.day18;

public class ExceptionDemo02 {

    public static void main(String[] args) {
        // 堆内存溢出案例
        // int[] arr = new int[1024 * 1024 * 1024]; // // 1KB-->1M-->1G // OutOfMemoryError

        //栈内存溢出案例
        m1(); // StackOverflowError
    }

    public static void m1() {
        m1();
    }
}
