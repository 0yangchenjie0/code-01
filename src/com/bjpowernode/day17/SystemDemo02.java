package com.bjpowernode.day17;

import java.util.Properties;

public class SystemDemo02 {
    public static void main(String[] args) {
        Properties prop = System.getProperties();

        // 操作系统的版本
        System.out.println(prop.getProperty("os.name")); // Windows 10
        // CPU的架构
        System.out.println(prop.getProperty("os.arch")); // amd64

        System.out.println(prop.getProperty("java.vm.name")); // Java HotSpot(TM) 64-Bit Server VM
        System.out.println(prop.getProperty("java.vm.version")); // 25.202-b08

        // 获取用户的当前工作目录
        System.out.println(prop.getProperty("user.dir")); // D:\course\01-JavaSE\code

    }
}
