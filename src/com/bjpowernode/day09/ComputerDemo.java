package com.bjpowernode.day09;

import java.util.Scanner;

/**
 * 实现一个计算器
 * 可以进行四则运算
 * 使用方法带来的好处：
 * 1.让开发更简单，复用，可以复用已经写好的方法完成逻辑
 * 2.让程序的结构更清晰
 * <p>
 * 需求：
 * 1.输入一个数组的长度
 * 2.给数组初始化值，数组的元素从键盘录入
 *
 * main --> （initArray --> getInt）---> sum
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 初始化数组
            int[] arr = initArray(scanner);
            // 如果方法可变参数只有一个，可以直接传递一个该类型的数组作为参数
            // 计算数组中所有元素的和
            int result = sum(arr);
            System.out.println("累加后的结果：" + result);
        }
    }

    // 初始化数组
    static int[] initArray(Scanner scanner) {
        System.out.print("请输入数组的长度：");
        // 从键盘接受一个数组长度
        int length = getInt(scanner);
        // 定义一个长度为 length 的整数数组
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入一个整数：");
            arr[i] = getInt(scanner);
        }
        return arr;
    }

    static int getInt(Scanner scanner) {
        int value = scanner.nextInt();
        // 返回输入的内容
        return value;
    }


    static int sum(int... arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
