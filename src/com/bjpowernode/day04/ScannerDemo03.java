package com.bjpowernode.day04;

import java.util.Scanner;

/**
 * 从键盘输入两个浮点数，输出两个浮点数 + - * / % 后的结果
 */
public class ScannerDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个浮点数：");
        double num1 = scanner.nextDouble();

        System.out.print("请输入第二个浮点数：");
        double num2 = scanner.nextDouble();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
    }
}
