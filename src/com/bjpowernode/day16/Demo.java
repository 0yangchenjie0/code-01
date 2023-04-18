package com.bjpowernode.day16;

public class Demo {

    Demo m1() {
        System.out.println("m1");
        return this;
    }

    Demo m2() {
        System.out.println("m2");
        return this;
    }
    Demo m3() {
        System.out.println("m3");
        return this;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1().m2().m3().m2();
    }
}
