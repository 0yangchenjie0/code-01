package com.bjpowernode.day09;

/**
 * - 形式参数：方法定义中的参数，简称形参
 * - 实际参数：方法调用时传入的参数，简称实参
 *  Java 方法中所有参数都是 值传递， 传递的是值的副本。
 * 基本数据类型作为方法的参数传递，形参的改变不影响实参的内容
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        int a = 100;
        m1(a); // 调用方法时，传入的参数称为 实参
        System.out.println("main:" + a); // 100
    }


    /**
     *
     * @param a 形参 定义方法的时候使用参数
     */
    static void m1(int a) {
        a = 200;
        System.out.println("m1:" + a); // 200
    }
}
