package com.bjpowernode.day13;

/**
 * 被final修饰的成员变量，一定要确保在创建对象之前完成赋值动作
 */
public class FinalDemo03 {

    public static void main(String[] args) {
        new Car();
    }
}

class Car {
    {
        // 在构造代码块中赋值
        // this.i = 100;
    }

    Car() {
        // 在构造方法中赋值
        this.i = 100;
    }
    // 声明final的成员变量直接赋值
    // final int i = 100;

    final int i;
}
