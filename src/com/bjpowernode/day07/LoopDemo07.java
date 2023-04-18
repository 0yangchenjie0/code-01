package com.bjpowernode.day07;

import java.util.Scanner;

/*
 打印三角形
 输入参数 n，输出图像

*
* *
* * *
* * * *
*
* *
* * *
* * * *
* * * * *

三角形的* 的行数等于n

for while if switch do while 是可以灵活嵌套使用的
 */
public class LoopDemo07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入三角形*的行数：");
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
