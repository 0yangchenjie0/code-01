package com.bjpowernode.day13.authdemo02.p1;

import com.bjpowernode.day13.authdemo02.User;

public class Test03 extends User {

    public static void main(String[] args) {
//        User user = new User();
        Test03 user = new Test03();

        // System.out.println(user.a1); // 错误 private
        // System.out.println(user.a2); // default 当前包
        System.out.println(user.a3); // protected 当前包和其它包的子类
        System.out.println(user.a4); // public
    }
}
