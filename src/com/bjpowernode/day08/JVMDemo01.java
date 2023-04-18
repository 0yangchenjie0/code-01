package com.bjpowernode.day08;

/**
 * 栈：后进先出  子弹夹
 * 方法的入栈和出栈，
 * 方法开始运行 入栈  main --> m1 ---> m2
 * 方法运行结束 出栈  m2--> m1 --> main
 */
public class JVMDemo01 {
    public static void main(String[] args) {
        m1();
        System.out.println("main执行结束");
    }

    public static void m1() {
        m2();
        System.out.println("m1执行结束");
    }

    public static void m2() {
        System.out.println("m2执行结束");
    }
}
