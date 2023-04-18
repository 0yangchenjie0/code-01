package com.bjpowernode.day13;

import java.util.Arrays;

public class FinalDemo02 {

    public static void main(String[] args) {
        final int a;
        a = 100;
        // a = 200; 错误，final 修饰的变量值不能被再改变

        final int b = 200;
        // b = 300; 错误
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------");

        final int[] arr = new int[]{1, 2, 3};
        // arr = null; // 错误
        // arr = new int[]{4, 5, 6}; 错误
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------");

        final Phone p1 = new Phone();
        p1.i = 100;
        // p1 = new Phone(); 错误
        System.out.println(p1.i);

    }
}

class Phone {
    int i;
}
