package com.bjpowernode.day06;

/**
 * 输出1到10之间的偶数；
 */
public class ForDemo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
