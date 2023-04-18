package com.bjpowernode.day06;

/**
 * 输出1-10之间所有的偶数
 */
public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 !=0) {
                // 如果遇到奇数，继续下次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
