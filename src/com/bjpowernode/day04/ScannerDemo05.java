package com.bjpowernode.day04;

import java.util.Scanner;

public class ScannerDemo05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = scanner.next();
        System.out.println("您好：" + name);

        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("您今年 " + age + "岁");

        System.out.print("请输入体重：");
        double weight = scanner.nextDouble();
        System.out.println("您的体重是：" + weight);
    }
}
