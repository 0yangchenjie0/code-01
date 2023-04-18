package com.bjpowernode.day13;

/**
 * 创建子类对象的时候，调用子类的构造方法
 * 在子类构造方法的第一句是调用父类的构造方法super(),
 * 或者调用重载的构造方法this()
 *
 * 思考：
 * 创建子类对象的时候，能不能调用父类的带参数的构造方法呢？
 */
public class ExtendsDemo04 {

    public static void main(String[] args) {
        // new D2();
        new D2("jack");
    }

}

class D1 {
    D1() {
        System.out.println("init.D1");
    }

    D1(String name) {
        System.out.println("init.D1.name");
    }
}

class D2 extends D1 {
    D2() {
        // 在子类构造方法的第一句是调用父类的构造方法super(),
        super(); // 如果代码中没有调用父类的构造方法，编译器会帮我们加上
        System.out.println("init.D2");
    }

    D2(String name) {
        // super();
        super(name);
        // this();
        System.out.println("init.D2.name");
    }
}
