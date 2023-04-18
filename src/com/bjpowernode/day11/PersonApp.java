package com.bjpowernode.day11;
/**
 * 类名 对象名称(变量名称) = new 类名();
 *
 * 对象名称.属性名称
 * 对象名称.方法名称()
 */
class Person {
    // 成员变量
    String name; // 姓名
    int age; // 年龄

    // 成员方法
    void sayHello() {
        System.out.println("Hello World");
    }
}

public class PersonApp {
    public static void main(String[] args) {
        // 创建一个具体的人的对象
        Person person = new Person();

        // 访问对象的属性
        System.out.println(person.name);// null
        System.out.println(person.age); // 0

        // 给成员变量赋值
        person.name = "jack";
        person.age = 18;

        System.out.println(person.name);// jack
        System.out.println(person.age); // 18

        // 调用对象的方法
        person.sayHello(); // Hello World
    }
}
