package com.bjpowernode.day02;

public class VarableDemo01 {
    public static void main(String[] args) {
        // 声明变量
        int a; // 在内存开辟空间, 注意：在方法中使用变量，必须赋值后才能使用
        // 给变量赋初值
        a = 100;
        // 改变变量的内容
        a = 200;
        System.out.println(a);

        System.out.println("------------------------------------------");
        // 声明变量的同时给变量赋初值
        double b = 3.1415926;
        System.out.println(b);

        System.out.println("------------------------------------------");
        // 定义一个字符类型的变量，字符需要 '' 包裹，单引号中只能有一个字符
        char c1 = 'a';
        char c2 = '家';
        char c3 = '8';
        // char c4 = 'abc'; 错误

        System.out.println(c1); // 输出字符的时候，不会输出单引号
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("------------------------------------------");
        // 一次定义多个变量,多个变量的数据类型要一样 （了解）
        int n1, n2, n3;
        // 分别赋值
        n1 = 100;
        n2 = 200;
        n3 = 300;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);


        System.out.println("------------------------------------------");
        // 一次声明多个变量，同时赋值
        int n4 = 400, n5 = 500, n6 = 600;
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

        // 变量类型一旦确定，不能改变存储的数据的数据类型
        int age = 18;
        // age = 20.5; 编译错误
        // int age = 200; 变量只能定义一次，不能重复定义，但是可以多次赋值

        System.out.println("------------------------------------------");
        // 定义整数、小数、字符、字符串变量
        int v1 = 100;
        double v2 = 3.14159;
        char v3 = '家';
        String v4 = "我们开始学习Java...";
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4); // 输出字符串不包括 ""
    }
}
