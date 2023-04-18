package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 查询水果的价格，根据输入水果(fruit)的名字，输出对应的水果的价格，
 * 例如
 * 苹果(A) 6块/斤，
 * 香蕉(B) 3元/斤，
 * 榴莲(C) 20元/斤，
 * 西瓜(D) 0.8元/斤。
 */
public class SwitchDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入水果的代码：");
        String input =  scanner.next();
        switch (input) {
            case "A": {
                System.out.println("苹果：6块/斤");
                break;
            }
            case "B": {
                System.out.println("香蕉：3块/斤");
                break;
            }
            case "C": {
                System.out.println("榴莲：20块/斤");
                break;
            }
            case "D": {
                System.out.println("西瓜：0.8块/斤");
                break;
            }
            default: {
                System.out.println("输入代码错误");
            }
        }
    }
}
