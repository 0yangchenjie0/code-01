package com.bjpowernode.day12;

/**
 * 构造代码块

 * 在类中，没有用static修饰的代码块叫做构造代码块（非静态代码块），主要用于 给所有对象共性特点进行初始化操作！
 * 构造代码块特点：
 * 1、 构造代码块只能定义在类里面，独立于任何方法，不能定义在方法里面。
 * 2、 一个类中允许定义多个构造代码块，执行的顺序根据定义的顺序进行。
 * 3、 构造代码块中的变量都是局部变量，既可以访问静态变量也可以访问实例变量。
 * 4、 构造代码块随着对象的创建而加载，每创建对象一次就执行一次！
 * 构造代码块作用：
 * 可以将各个构造方法中公共的代码提取到构造代码块。
 */
public class ConstrutorBlockDemo {

    static int MAX_VALUE = 1000; // 所有对象共享静态变量

    int i = 1024; // 每个对象独有成员变量

    ConstrutorBlockDemo() {
        System.out.println("构造方法 i = " + this.i); // 1026

    }

    ConstrutorBlockDemo(String name) {
        System.out.println("构造方法 i = " + this.i); // 1026
    }


    {
        MAX_VALUE++;
        int i = 100;
        System.out.println("构造代码块1 " + MAX_VALUE + " " + i);
        this.i++;

    }

    {
        MAX_VALUE++;
        int i = 200;
        System.out.println("构造代码块2 " + MAX_VALUE + " " + i);
        this.i++;

    }
}
