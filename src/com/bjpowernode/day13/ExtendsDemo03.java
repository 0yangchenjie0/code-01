package com.bjpowernode.day13;

public class ExtendsDemo03 {
    public static void main(String[] args) {
        B2 b2 = new B2();
        b2.sayHello(); // hello 调用父类的方法
        b2.sayHi(); // 调用当前类的方法

        // 子类和父类出现同名同参数的方法
        b2.test(); // B2...test 调用当前类的方法

    }
}

class B1 {

    void sayHello() {
        System.out.println("Hello");
    }

    void test() {
        System.out.println("B1...test");
    }
}

class B2 extends B1 {

    void sayHi() {
        System.out.println("Hi");
    }

    void test() {
        // 使用super关键字可以调用父类的方法
        super.test(); // B1...test
        System.out.println("B2...test");
    }
}
