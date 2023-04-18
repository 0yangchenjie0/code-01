package com.bjpowernode.day13;

public class ExtendsDemo01 {

    public static void main(String[] args) {
        A a = new A();
        a.sayHello();

        B b = new B();
        // 子类继承了父类的方法
        b.sayHello();

        C c = new C();
        c.sayHello();
    }
}

class A {
    void sayHello() {
        System.out.println("Hello ...");
    }
}

// B类继承了A类
class B extends A {


}

// 多层继承 C --> B --- A
class C extends B {

}



// Java 不允许多继承，一个类只能有一个直接的父类
//class C extends A, B {
//
//}

