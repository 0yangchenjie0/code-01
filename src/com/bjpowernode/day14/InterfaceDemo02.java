package com.bjpowernode.day14;

public class InterfaceDemo02 {
    public static void main(String[] args) {
        B b = new B();
        b.m0();
        b.m1();
        b.m2();
    }
}

interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

class A {
    void m0() {
        System.out.println("class A m0");
    }
}

// 一个类可以继承父类的同时，实现多个接口
class B extends A implements I1, I2 {

    @Override
    public void m1() {
        System.out.println("class B m1");
    }

    @Override
    public void m2() {
        System.out.println("class B m2");
    }
}