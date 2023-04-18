package com.bjpowernode.day15.demo04;

/**
 * 多态的成员变量
 * 编译看左，运行看左
 *
 * 多态的成员方法
 * 编译看左，运行看右
 */
public class AnimalDemo04 {

    public static void main(String[] args) {
        Animal ant = new Ant();
        System.out.println(ant.name); // 动物
        // 错误
        //System.out.println(ant.age);
        ant.info(); // 蚂蚁...
        ant.test01();

        // 错误
        // ant.test02();
    }
}

class Animal {
    String name = "动物";

    void info() {
        System.out.println("动物...");
    }

    // 父类特有
    void test01() {
        System.out.println("test01...");
    }
}

class Ant extends Animal {
    String name = "蚂蚁";
    int age = 1;

    @Override
    void info() {
        System.out.println("蚂蚁...");
    }

    void test02() {
        System.out.println("test02...");
    }
}
