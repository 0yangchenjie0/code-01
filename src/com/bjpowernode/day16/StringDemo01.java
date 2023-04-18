package com.bjpowernode.day16;

public class StringDemo01 {
    public static void main(String[] args) {
        // 字符串多次赋值案例
        // 方法栈中的str指向堆中的某个地址
        String str = new String("bjpowernode");

        // 又产生了一个新的字符串对象
        // 方法栈中的str指向堆中的另一个地址
        str = "动力节点"; // final value[]

        // 1.创建一个空字符串
        String str1 = new String();//

        // 2.通过常量字符串来创建字符串
        String str2 = new String("Hello");

        // 3.通过字节数组创建字符串
        String str3 = new String(new byte[]{'A', 66, 67});

        // 4.通过字符数组创建字符串
        String str4 = new String(new char[]{65,'B',67});

        System.out.println(str1);
        System.out.println(str2); //Hello
        System.out.println(str3); //ABC
        System.out.println(str4); //ABC
    }
}
