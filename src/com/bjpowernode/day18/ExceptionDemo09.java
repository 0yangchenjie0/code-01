package com.bjpowernode.day18;

public class ExceptionDemo09 {
}


class A {
    void m1() throws Exception {

    }

    void m2() {

    }

}

class B extends A {
    // 重写的方法可以不声明异常
//    void m1() {
//
//    }

    // 子类方声明的异常范围不能超过父类方法声明范围
    // void m1() { 正确
    // void m1() throws Exception { 正确
    // void m1() throws FileNotFoundException { 正确
    // void m1() throws Throwable { 错误 子类方法不能声明比父类更多异常
    void m1() throws Exception {

    }

    // void m2() throws Exception  错误，父类方法没有异常，子类方法也不能有异常
    void m2()  {

    }
}
