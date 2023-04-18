package com.bjpowernode.day15.demo06;


public class InnerClassDemo01 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.info();
        System.out.println("---------------");

        // 在其它类，访问一个类的内部类
        // 外部类.内部类  向创建外部类的对象，再创建内部类的对象
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass("jack");
        innerClass.m1(); // 成员内部类的方法 m1:jack


    }
}


class OuterClass {

    String str = "外部类";

    // 成员内部类
    class InnerClass {
        // 成员内部类中不能存在任何的静态的成员。
        // static i = 100; // 错误

        // 成员内部类的变量
        String name;
        // 无参构造
        InnerClass() { }
        // 带参数的构造
        InnerClass(String name) {
            // this 是内部类的对象
            this.name = name;
        }
        void m1() {
            System.out.println("成员内部类的方法 m1:" + this.name);
            // 调用外部类的成员
            System.out.println(OuterClass.this.str);
            OuterClass.this.info();
        }
    }

    // 外部类的静态方法中不能访问成员内部类
    static void ounterM1() {
        // System.out.println(this.str); 错误
        // System.out.println(this.InnerClass); 错误
    }


    // 在外部类内使用内部类
    void info() {
        // 创建内部类的对象
        InnerClass innerClass = new InnerClass("jack");
        // 访问内部类的属性
        System.out.println(innerClass.name); //jack
        // 调用内部类的方法
        innerClass.m1(); // 成员内部类的方法 m1
    }
}
