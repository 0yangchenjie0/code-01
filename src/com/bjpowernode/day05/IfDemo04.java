package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 控制台输入年龄 age，范围(0,120]
 *   输入 age < 18 并且 age>0 ，输出 未成年
 *   输入 age>=18 并且 age<=40 ，输出 有位青年
 *   输入 age>40 并且 age<=60 ，输出 步入中年
 *   输入 age>60 并且 <=120，输出 进入老年
 */
public class IfDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();

        if (age<=0 || age>120) {
            System.out.println("年龄输入错误...");
        }
        else if (age<18) { // age>0 && age<18
            System.out.println("未成年");
        }
        else if(age<=40) { // age>=18 && age<=40
            System.out.println("有位青年");
        }
        else if (age<=60) {// age>40 && age<=60
            System.out.println("步入中年");
        }
        else { // age>60 && age<=120
            System.out.println("进入老年");
        }
    }
}
