package com.bjpowernode.day11.homework;

import java.util.Scanner;

/**
 * 定义一个 StudentApp 类，完成如下功能：
 * <p>
 * 定义一个学生类（Student）
 * 学生类成员变量：
 * number：学号
 * name：姓名
 * age：年龄
 * 学生类构造方法：自己定义
 * 学生类成员方法：
 * // 控制台输出学生的基本信息
 * void info() {
 * <p>
 * }
 * 实现业务：
 * *    第一步：从键盘接收学生的数量，该学生的数量（num）定义为数组的长度
 * *    第二步：定义一个学生数组，来存储学生对象
 * *        定义对象数组语法： Student[] arr = new Studnet[num];
 * *    第三步：做一个循环输入 num 数量的学生，将每个学生的信息封装到学生对象中，然后将这个学生对象存储到数组中
 * *    第四步：学生信息录入完毕后，在控制台循环输出学生的基本信息(直接调用学生对象的 info() 方法)
 */
public class StudentApp {
    public static void main(String[] args) {
        // 1.从键盘输入学生人数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int studentNum = scanner.nextInt();

        // 2.创建一个学生数组存储学生信息
        // 数据类型[] arr = new 数据类型[length];
        Student[] students = new Student[studentNum];

        // 3.录入学生信息
        for (int i = 0; i < studentNum; i++) {
            // 每次循环输入一个学生信息
            System.out.print("请输入学号：");
            String number = scanner.next();

            System.out.print("请输入姓名：");
            String name = scanner.next();

            System.out.print("请输入年龄：");
            int age = scanner.nextInt();

            // 将录入的学生信息封装到学生对象中
            // Student student = new Student(number, name, age);
            // 将学生对象存储到数组中
            // students[i] = student;
            students[i] = new Student(number, name, age);
        }

        // 4.控制台输出所有学生的信息
//        for(Student student : students) {
//            System.out.println("---------------------------------------");
//            student.info();
//        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("-----------------------------");
            students[i].info();

//            Student student = students[i];
//            student.info();
        }
    }
}

class Student {
    String number;
    String name;
    int age;

    Student(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("学号：" + this.number);
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    }
}