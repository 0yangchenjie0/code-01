package com.bjpowernode.day12;

/**
 * 1、 静态变量优先于对象存在，静态变量随着类的加载就已经存在了。
 * 2、 一个类中，静态变量只有一份，可以被该类和该类的对象所共享。
 * 3、 我们可以通过 类名.静态变量 或 对象.静态变量  来操作静态变量。
 *
 * 静态变量不属于莫一个具体的对象，是属于类的，推荐使用 类名.静态变量 的方式访问静态变量
 *
 * 类先加载，然后才能创建对象
 */
public class StaticDemo {

    public static void main(String[] args) {
//        System.out.println(Math.pi); // 3.14159 静态变量可以通过类直接方法
//        Math.pi = 3.14;
//        System.out.println(Math.pi); // 3.14
//
//        Math math1 = new Math(100);
//        math1.i = 300;
//        System.out.println(math1.i); // 300 成员变量只能通过对象方法
//
//        System.out.println(math1.pi); // 3.14 通过对象访问类变量
//
//
//        Math math2 = new Math(200);
//        System.out.println(math2.i); // 200 成员变量只能通过对象方法
//
//        System.out.println("---------------------");
//        math2.pi = 3.00;
//        System.out.println(math1.pi);//3.0
//        System.out.println(math2.pi);//3.0
//        System.out.println(Math.pi);//3.0


        // 静态方法可以通过类直接方法
        Math.m2();

        Math math3 = new Math(400);
        // math3.m1(); // 通过对象调用普通成员方法
        math3.m2(); // 通过对象调用静态方法

    }
}

/**
 * 数学类
 * 类 -- 类变量 --- 对象 --- 调用非静态方法
 */
class Math {
    // 静态变量
    static double pi = 3.14159;
    // 成员变量
    int i;

    Math(int i) {
        this.i = i;
    }

    // 成员方法，可以访问成员变量和静态变量
    void m1() {
        // 局部变量不能使用 static 关键字修饰
        // static m = 100;
        System.out.println(pi);
        // 成员方法中可以使用 this 关键字
        System.out.println(this.i);

        // 成员方法可以调用静态方法
        // m2();
    }

    // 静态方法 (类方法)  静态方法中只能访问静态变量
    static void m2() {
        System.out.println("m2.static");
        System.out.println(pi);
        // 非静态成员变量只能在创建对象后才完成初始化
        // System.out.println(this.i); 错误

        // 静态方法只能调用静态方法
        // m1(); 错误
    }
}
