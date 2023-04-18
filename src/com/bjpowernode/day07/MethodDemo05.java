package com.bjpowernode.day07;

/**
 * [修饰符] 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2，……) {
 * <p>
 * // 执行语句;
 * return 返回值；
 * }
 * <p>
 * 在一个方法内，调用另一个方法
 */
public class MethodDemo05 {

    public static void main(String[] args) {
        System.out.println("main");
        // m1();
    }

    public static void m1() {
        System.out.println("m1");
        // 在一个方法中调用另一个方法
        m2();
    }

    public static void m2() {

        System.out.println("m2");
        m3();
    }

    public static void m3() {
        System.out.println("m3");
    }

}

// main m1 m2 m3
