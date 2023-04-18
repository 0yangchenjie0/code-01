package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 控制台输入一个数字，范围[1,2,3,4]
 *   输入1，输出 春天
 *   输入2，输出 夏天
 *   输入3，输出 秋天
 *   输入4，输出 冬天
 */
public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("春天");
        } else if (num == 2) {
            System.out.println("夏天");
        } else if (num == 3) {
            System.out.println("秋天");
        } else if (num == 4) {
            System.out.println("冬天");
        } else {
            System.out.println("输入范围错误");
        }
    }
}
