package com.bjpowernode.day07;

import java.util.Scanner;

/**
 * 输入两个 double 类型的浮点数，计算两个浮点数加减乘除后的结果
 *   输入指令：
 *       [i]：执行计算
 *       [+]：执行加法
 *       [-]：执行减法
 *       [*]：执行乘法
 *       [/]：执行除法
 *       [q]：退出
 */
public class HomeWork01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("命令说明：");
            System.out.println("[i]：执行计算");
            System.out.println("    [+]：执行加法");
            System.out.println("    [-]：执行减法");
            System.out.println("    [*]：执行乘法");
            System.out.println("    [/]：执行除法");
            System.out.println("    [b]：返回");
            System.out.println("[q]：退出");
            System.out.print("请输入指令:> ");
            String input = scanner.next();

            if ("i".equals(input)) { // 执行计算
                System.out.print("请输入一个浮点数：");
                double num1 = scanner.nextDouble();

                System.out.print("请输入一个浮点数：");
                double num2 = scanner.nextDouble();

                while (true) {
                    System.out.print("请输入计算指令:> ");
                    String m = scanner.next();

                    if ("b".equals(m)) {
                        // 返回上级菜单
                        break;
                    } else {
                        // 进行计算
                        switch (m) {
                            case "+": {
                                System.out.println(num1 + num2);
                                break;
                            }
                            case "-": {
                                System.out.println(num1 - num2);
                                break;
                            }
                            case "*": {
                                System.out.println(num1 * num2);
                                break;
                            }
                            case "/": {
                                System.out.println(num1 / num2);
                                break;
                            }
                            default: {
                                System.out.println("指令输入错误");
                                break;
                            }
                        }
                    }
                }
            }
            // 退出
            else if ("q".equals(input)) {
                // 提前结束当前循环
                System.out.println("退出系统成功");
                break;
            }
            // 输入的指令错误
            else {
                System.out.println("输入的指令错误");
            }
        }

    }
}
