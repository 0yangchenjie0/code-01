package com.bjpowernode.day13.authdemo01;

public class AuthApp {
    public static void main(String[] args) {
        // F1 f1 = new F1(); 错误
        F1 f1 = new F1(1);
        F1 f11 = new F1(1.1);
        F1 f12 = new F1("AA");

        // System.out.println(f1.a1); 错误
        System.out.println(f1.a2);
        System.out.println(f1.a3);
        System.out.println(f1.a4);

        // f1.m1(); // 错误
        f1.m2();
        f1.m3();
        f1.m4();
    }
}
