package com.bjpowernode.day11;

public class TeacherApp {
    public static void main(String[] args) {
        System.out.println("开始...");
        Teacher t1 = new Teacher("jack",18);
        System.out.println(t1.name); // jack
        System.out.println(t1.age); // 18
    }
}

class Teacher {

    Teacher() {
        System.out.println("init....");
    }

    Teacher(String name) {
        this();
        this.name = name;

    }

    Teacher(String name,int age) {
        this(name);
        this.age = age;
    }

    String name;
    int age;

}