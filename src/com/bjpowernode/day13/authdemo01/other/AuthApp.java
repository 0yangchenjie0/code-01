package com.bjpowernode.day13.authdemo01.other;

import com.bjpowernode.day13.authdemo01.F1;

public class AuthApp {
    public static void main(String[] args) {
        // F1 f1 = new F1(); 错误  private
        // F1 f1 = new F1(1); 错误 default 修饰的成员只能在相同包下被访问到
        // F1 f1 = new F1(1.1); 错误 protected 要想本包中的类与其他包中的子类可以访问使用
        F1 f1 = new F1("1111"); // 正确 public 可以被所有类访问

        // System.out.println(f1.a1); // 错误
        // System.out.println(f1.a2); // 错误
        // System.out.println(f1.a3); // 错误
        System.out.println(f1.a4);

        //f1.m1(); // 错误
        //f1.m2(); // 错误
        //f1.m3(); // 错误
        f1.m4();
    }
}


class F2 extends F1 {
    F2() {
        // super(); 错误
        // super(2.0); // protected 不同包下的子类
        super("aaa");
    }

    void test() {
        F2 f = new F2();
        //System.out.println(f.a1); 错误
        //System.out.println(f.a2); 错误
        System.out.println(f.a3);
        System.out.println(f.a4);
    }
}
