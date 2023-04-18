package com.bjpowernode.day12;

public class StaticBlockApp {

    public static void main(String[] args) {
        // 创建对象前，会先出初始化类，类只初始化一次
        new StaticBlockDemo(); // 类的初始化，对象初始化
        new StaticBlockDemo(); // 对象初始化

        System.out.println(StaticBlockDemo.MAX_VALUE); // 100
        System.out.println(StaticBlockDemo.MAX_VALUE); // 100

        StaticBlockDemo blockDemo = new StaticBlockDemo();
        blockDemo.m2();
    }
}
/*
静态方法
init.static{}
init.()...
init.()...
100
100
init.()...
非静态方法
 */