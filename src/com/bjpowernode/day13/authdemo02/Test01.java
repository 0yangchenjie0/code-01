package com.bjpowernode.day13.authdemo02;

public class Test01 {

    public static void main(String[] args) {
        User user = new User();

        // System.out.println(user.a1); // 错误 private
        System.out.println(user.a2); // default 当前包
        System.out.println(user.a3); // protected 当前包 和其它包的子类
        System.out.println(user.a4); // public
    }
}
