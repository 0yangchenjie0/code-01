package com.bjpowernode.day06;

import java.util.Scanner;

/**
 *  需求：从键盘输入一个用户姓名，输出：您好：姓名。用户可以多次输入姓名
 */
public class WhileDemo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        for(;;) {
//            System.out.print("请输入用户姓名：");
//            String name = scanner.next();
//            System.out.println("您好：" + name);
//        }

        while (true) {
            System.out.print("请输入用户姓名：");
            String name = scanner.next();
            System.out.println("您好：" + name);
        }

        // System.out.println("");
    }
}
