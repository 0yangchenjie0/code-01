package com.bjpowernode.day12;

public class StaticBlockDemo {

    static int MAX_VALUE;

    int i;

    StaticBlockDemo() {
        System.out.println("init.()...");
    }

    // 被static修饰的代码块称为静态代码块，只能放到类中，不能在其它位置出现
    // 随着类的加载而运行，只执行一次，一般用来完成静态变量的初始化工作
    static {
        int i = 100;
        // 静态代码块只能访问静态变量和其它静态方法
        MAX_VALUE = 100;
        // i = 100; // 错误
        m1();
        // m2(); // 错误
        System.out.println("init.static{}");
    }



    static void m1() {

        System.out.println("静态方法");
    }

    void m2() {
        System.out.println("非静态方法");
    }

}
