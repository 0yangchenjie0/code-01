package com.bjpowernode.day07;

/**
 * [修饰符] 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2，……) {
 *
 *          // 执行语句;
 *           return 返回值；
 * }
 *
 * 定义一个方法，传入两个整数，在方法中打印两个整数相加后的结果，方法无返回值
 */
public class MethodDemo02 {

    public static void main(String[] args) {
        // 调用方法,传入的参数的数据类型要和方法定义的参数的数据类型保持一致,或可以自动数据类型转换

        add(10,20);
    }

    public static void add(int a, int b) {
        // return; 错误
        System.out.println(a + b);
        // 如果方法没有返回值，return 语句可以省略，如果有return，要在方法代码的结束位置
        // return;
    }

}
