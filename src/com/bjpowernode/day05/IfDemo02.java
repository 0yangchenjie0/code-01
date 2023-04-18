package com.bjpowernode.day05;
import java.util.Scanner;

/**
 * 模拟用户登录操作（用户名和密码都用字符串），需要判断出登录成功和登录失败的情况。
 * 系统内置账号 jack 密码 123456
 * <p>
 * 如果账号不是jack 或者密码不是123456 用户名或密码错误
 * 如果账号是jack，密码是 123456 登录成功
 * <p>
 * 注意：判断字符串是否相同，不能使用==，而是需要使用equals方法。
 */
public class IfDemo02 {
    public static void main(String[] args) {
        //1.从键盘输入用户名和密码
        Scanner scanner = new Scanner(System.in);
        // 接收用户名
        System.out.print("请输入用户名:");
        String username = scanner.next();
        // 接收密码
        System.out.print("请输入密码:");
        String password = scanner.next();
//        if (!"jack".equals(username) || !"123456".equals(password)) {
//            // 用户不等于jack，或者密码不等于123456
//            System.out.println("用户名或密码错误");
//        } else {
//            // 用户名等于jack并且密码是123456
//            System.out.println("登录成功");
//        }
        if ("jack".equals(username) && "123456".equals(password)) {
            // 用户名和密码正确
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }
}





