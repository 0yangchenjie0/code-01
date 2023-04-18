package com.bjpowernode.day06;

import java.util.Scanner;

/**
 * 输入一个正整数 n，计算 1-2+3-4+5-6+…-(n-1)+n 的和；
 * 分析：
 * 1-n都要参数计算
 * 奇数累加
 * 偶数累减
 */
public class ForDemo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // 偶数的时候，result - i
                result -= i;
            } else {
                // 奇数的时候，result + i
                result += i;
            }
        }
        System.out.println("result=" + result);
    }
}
// 第一次循环 reuslt = result + i  -- 0 + 1
// 第二次循环 result = result - i  -- 0 + 1 - 2
// 第三次循环 result = result + i  -- 0 + 1 - 2 + 3
// ...