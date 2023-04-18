package com.bjpowernode.day06;

/**
 * break 用于循环结构，会提前结束循环，当次循环中，break后面的语句也不再执行
 */
public class BreakDemo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                // 提前结束循环
                break;
            }
            System.out.println(i);
        }
    }
}
