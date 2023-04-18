package com.bjpowernode.day09;

/**
 * 程序的运行都是从main方法开始
 * main方法中可以调用其它的方法，在其它方法中可以调用其它的方法
 * 方法中不能定义方法，方法只能定义到类中
 * 1.方法定义
 * 2.方法调用
 */
public class MethodDemo01 {

    // main 方法中只能调用被static修饰的方法
    public static void main(String[] args) {
        // 调用方法
        add(100, 200);

        // 调用带返回值的方法，可以将返回值赋值给一个变量
        int sum = sum(1,2);
        System.out.println(sum);

        System.out.println("---------------------------");
        // 将方法的返回值作为另一个方法的参数

        add(sum(1,2),sum(2,2));
        // 等价于
        int sum1 = sum(1,2);
        int sum2 = sum(2,2);
        add(sum1,sum2);
    }

    /**
     * 没有返回值的方法
     */
    static void add(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        return; // 没有返回值的方法，return语句可以省略
    }

    /**
     * 方法的返回值要和方法的返回值类型保持一致
     */
    static int sum(int a, int b) {
        return a + b;
    }
}
