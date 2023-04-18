package com.bjpowernode.day07;

/**
 * [修饰符] 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2，……) {
 *
 *          // 执行语句;
 *           return 返回值；
 * }
 *
 * 定义一个方法，传入两个浮点数，计算两个浮点数相加后的结果，并返回
 */
public class MethodDemo03 {

    public static void main(String[] args) {
        // 调用有返回值的方法，可以使用一个变量接收方法的返回值
        double sum = add(3.0,4.0); // 将方法的返回值赋值给变量 sum
        System.out.println(sum);
    }

    public static double add(double a, double b) {
        // double sum = a + b;
        // return sum;
        return a + b;
    }

}
