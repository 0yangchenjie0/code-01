package com.bjpowernode.day04;

import java.util.Scanner;

/**
 * 从键盘输入两个整数，输出较大的整数
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        // 1.从键盘接收两个整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();

        // 2.判断两个数的大小，输出较大的整数
        int max = num1 > num2 ? num1 : num2;
        System.out.println("较大的数是:" + max);
    }
}
