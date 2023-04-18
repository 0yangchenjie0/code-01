package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * if 分支结构
 *  1.根据年龄判断是否已经成年，年龄大于等于18表示成年
 *  2.判断一个数是否在5(包含)到10(包含)之间
 */
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 根据年龄判断是否已经成年，年龄大于等于18表示成年
//        System.out.print("请输入年龄：");
//        int age = scanner.nextInt();
//        if(age >= 18) {
//            // 满足 age>=18条件，执行下面的语句
//            System.out.println("成年");
//        }

        // 判断一个数是否在5(包含)到10(包含)之间，是，输出该数字
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        if (num >= 5 && num <= 10) {
            System.out.println("合法输入：" + num);
        }

        System.out.println("程序运行结束.");
    }
}

