package com.bjpowernode.day07;

/**
 *     [修饰符] 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2，……) {
 *
 *         // 执行语句;
 *         return 返回值；
 *     }
 * 定义一个没有参数，也没有返回值的方法
 * 需求：在方法中输出 Hello World
 */
public class MethodDemo01 {

    public static void main(String[] args) {
        // 调用方法
        sayHello();
        System.out.println("你好，java");
        sayHello();
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }

}
