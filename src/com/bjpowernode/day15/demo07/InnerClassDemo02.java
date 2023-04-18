package com.bjpowernode.day15.demo07;

public class InnerClassDemo02 {

    public static void main(String[] args) {
        OuterClass.InnerClass.m1();// 调用静态内部类的静态方法
        System.out.println(OuterClass.InnerClass.name); // 访问静态内部类的静态属性

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.m2();
    }
}

class OuterClass {

    String str = "外部类";

    static int num = 100;

    void outerM1() {
        InnerClass.m1();
        System.out.println(InnerClass.name);

        InnerClass innerClass = new InnerClass();
        innerClass.m2();
    }

    static void outerM2() {
        System.out.println("outerM2...");
    }

    // 静态内部类
    // 静态内部类只能访问外部类的静态成员
    static class InnerClass {
        static String name = "内部类";

        static void m1() {
            System.out.println(OuterClass.num); // 100
            //System.out.println(OuterClass.this.str); 错误

            OuterClass.outerM2();// outerM2...
            // OuterClass.this.outerM1(); 错误
        }

        void m2() {
            System.out.println("m2....");
        }
    }
}


