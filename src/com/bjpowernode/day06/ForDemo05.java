package com.bjpowernode.day06;

import java.util.Scanner;

/**
 * 输入一个正整数 n，计算 1+2+3+…+n 的和；
 * <p>
 * 计算 1+2+3+4+5 的和
 * <p>
 */
public class ForDemo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("sum=" + sum);
    }
}
// 第1次循环 sum = 0 + 1      sum==1
// 第2次循环 sum = 1 + 2      sum==3
// 第3次循环 sum = 1 + 2 + 3  sum==6
// 第4次循环 sum = 1 + 2 + 3 + 4  sum==10
// 第5次循环 sum = 1 + 2 + 3 + 4 + 5  sum==15