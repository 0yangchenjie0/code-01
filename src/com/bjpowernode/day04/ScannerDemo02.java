package com.bjpowernode.day04;

import java.util.Scanner;

/**
 * 从键盘输入一个年龄(整数)，age>=18,输出成年，否则输出未成年
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        String result = age >= 18 ? "成年" : "未成年";
        System.out.println(result);
    }
}
