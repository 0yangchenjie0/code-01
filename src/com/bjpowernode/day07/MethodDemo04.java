package com.bjpowernode.day07;

/**
 * [修饰符] 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2，……) {
 *
 *          // 执行语句;
 *           return 返回值；
 * }
 *
 * 定义一个方法，返回 圆周率的2倍
 */
public class MethodDemo04 {

    public static void main(String[] args) {
        // 调用方法,也可以将方法的返回值直接打印输出
        System.out.println(getPI2());

    }

    public static double getPI2() {
        return 3.1415926 * 2;
    }

}
