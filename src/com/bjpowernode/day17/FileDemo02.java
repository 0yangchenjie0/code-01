package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {

        // 绝对路径

        // 将1.txt抽象成了一个 File 类的对象
        File file1 = new File("D:\\A\\1.txt");

        System.out.println(file1.getName()); // 文件名  1.txt
        System.out.println(file1.getParent());// 父级目录 D:\A
        System.out.println(file1.getPath());  // D:\A\1.txt
        System.out.println(file1.getAbsolutePath()); // D:\A\1.txt  绝对路径
        System.out.println(new Date(file1.lastModified())); // Mon Apr 17 15:24:49 CST 2023
        System.out.println(file1.length()); // 6
//
//        File parent = new File("D:\\A"); // 目录
//
//        File file2 = new File(parent,"1.txt");
//
//        File file3 = new File("D:\\A","1.txt");

        // System.out.println(System.getProperties().getProperty("user.dir")); // D:\course\01-JavaSE\code
        File file4 = new File("a.txt");
        System.out.println(file4.getPath()); // 相对user.dir的路径 a.txt  相对路径
        System.out.println(file4.getAbsolutePath());// D:\course\01-JavaSE\code\a.txt  绝对路径



    }
}
