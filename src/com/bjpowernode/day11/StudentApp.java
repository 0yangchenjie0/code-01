package com.bjpowernode.day11;
/**
 * this 关键字的作用：
 *    - 解决局部变量和成员变量同名问题
 *       this.成员变量 访问成变量
 *    - 访问当前对象的成员
 *          成员变量
 *          成员方法
 *          构造方法
 *
 *    - 重载的构造方法之间互调
 */
public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
//        Student s2 = new Student("李四",20);
//        System.out.println(s1.name);
//        System.out.println(s2.name);
//        s1.sayHello();
//        System.out.println("----------------");
//        s2.sayHello();
    }
}

class Student {

    Student() {
        System.out.println("init()...");
    }

    /**
     * 构造方法
     * @param name 学生姓名
     * @param age 学生年龄
     */
    Student(String name,int age) {
        // 在一个构造方法中调用另一个构造方法
        this();

        // 构造方法只能调用一次，并且是在另一个构造方法的第一行出现
        // this();

        System.out.println("init(name,age)...");
        // 完成对象成员变量的初始化
        this.name = name;
        this.age = age;

        // 在构造方法中可以调用成员方法
        //sayHello();
        // this.sayHello();
    }

    String name; // 姓名
    int age; // 年龄

    void sayHello() {
        // 普通成员方法不能调用构造方法
        // this();

        System.out.println("我是：" + this.name);
        System.out.println("今年：" + age);
    }
}
