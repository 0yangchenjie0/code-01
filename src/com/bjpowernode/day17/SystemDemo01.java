package com.bjpowernode.day17;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemDemo01 {
    public static void main(String[] args) {
        // System.out.println("Hello");

        // 输出 内存 -->
        PrintStream out = System.out;
        out.println("Hello ");

        // 输入 --> 内存
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        // 获取当前时间戳
        System.out.println(System.currentTimeMillis());

        //return;
        // System.exit(0); // 关闭jvm

        test();

        System.out.println(".......");
    }


    public static void test() {
        System.exit(0); // 关闭jvm
    }
}
