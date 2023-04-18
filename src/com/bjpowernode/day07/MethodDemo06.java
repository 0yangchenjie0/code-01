package com.bjpowernode.day07;

/**
 *
 *  在同一个类中，如果出现一组方法名相同，参数类型不同 或参数个数不同、或参数顺序不同。
 *      这样一组同名的方法称为 方法重载
 *
 * 2.定义以下方法
 *   1.方法1：计算两个整数的和并返回
 *   2.方法2：计算两个浮点数的和并返回
 *   3.方法3: 计算一个整数和一个浮点数的和并返回
 *   4.方法4：计算一个浮点数和一个整数的和并返回
 */
public class MethodDemo06 {

    public static void main(String[] args) {
        System.out.println(add(100,200));
        System.out.println(add(10,3.0));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static int add(int a) {
        return a + 100;
    }
}
