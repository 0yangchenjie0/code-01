package com.bjpowernode.day15.demo09;

/**
 * **局部内部类注意点**
 * 1、 局部内部类只能在对应的局部作用域中实例化。
 * 2、 局部内部类中不能存在任何的静态变量和静态方法。
 * 3、 局部内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。
 * 4、 访问外部类成员变量：外部类.this.成员变量，访问外部类成员方法：外部类.this.成员方法。
 * 5、 局部内部类访问的外部局部变量都必须用 final修饰，以防止更改外部局部变量的值。JDK1.8之后不必添加 final。
 */
public class InnerClassDemo09 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.m2();
    }
}

class OuterClass {

    String str = "外部类";

    void m1() {
        System.out.println("外部类的方法...");
    }

    void m2() {
        // 定义一个局部变量
        int i = 100;

        // 定义局部内部类
        class InnerClass {
            // static i = 100; 错误
            void m3() {
                // i = 100; 错误，不能改变局部变量的值
                System.out.println("局部变量 i=" + i);
                System.out.println(OuterClass.this.str);
                OuterClass.this.m1();
            }
        }
        // 创建内部类的对象
        InnerClass innerClass = new InnerClass();
        innerClass.m3();
    }
}
