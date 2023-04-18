package com.bjpowernode.day06;
import java.util.Scanner;

/**
 * 循环结构综合练习
 * 输入一个整数 n,判断该数是否是质数，
 * 质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 * 可以多次输入
 * 指令：
 * [i]: 判断质数
 * [q]: 退出系统
 */
public class LoopDemo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 不确定循环次数，使用while循环
        while (true) {
            // 从键盘接收一个指令
            System.out.println("请输入指令：");
            System.out.println("[i]: 判断质数");
            System.out.println("[q]: 退出系统");
            System.out.print(">");
            String input = scanner.next();
            // 判断输入的指令的内容
            if ("i".equals(input)) {
                // 从键盘接收一个数字，判断是否是质数
                System.out.print("请输入一个大于1的整数：");
                int n = scanner.nextInt();
                boolean flag = true; // 默认是质数
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        // 不是质数
                        flag = false;
                        // 提前结束循环
                        break;
                    }
                }
                if (flag) {
                    System.out.println(n + "是质数");
                } else {
                    System.out.println(n + "不是质数");
                }
            } else if ("q".equals(input)) {
                // 输入的指令是q，退出系统
                System.out.println("退出系统成功 bye bye");
                break; // 结束while循环
            }
        }
    }
}
