package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {

        // 绝对路径

        // 将1.txt抽象成了一个 File 类的对象
//        File file1 = new File("D:\\A\\1.txt");
//
//        File parent = new File("D:\\A"); // 目录
//
//        File file2 = new File(parent,"1.txt");
//
//        File file3 = new File("D:\\A","1.txt");

        // 相对路径
        System.out.println(System.getProperties().getProperty("user.dir")); // D:\course\01-JavaSE\code
        File file4 = new File("a.txt");
        // 创建文件
        System.out.println(file4.createNewFile()); // true:表示创建了文件，false表示没有创建文件

    }
}
