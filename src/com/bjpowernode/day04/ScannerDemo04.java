package com.bjpowernode.day04;

import java.util.Scanner;

/**
 * 从键盘输入用户名和密码
 *     系统内置账号 jack 密码 123456
 *   如果账号不是jack，输出账号错误
 *   如果账号是jack，密码不是123456，输出密码错误
 *   如果账号和密码都正确，输出 登录成功
 *   难点：如何判断一个字符串和另一个字符串是否相等（不能使用 ==）
 */
public class ScannerDemo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.next();

        System.out.print("请输入密码：");
        String password = scanner.next();

        // 不要用 == 来判断两个字符串是否相等,使用 equals 方法判断字符串的内容是否相同
        System.out.println("jack".equals(username));
        System.out.println("123456".equals(password));
    }
}
