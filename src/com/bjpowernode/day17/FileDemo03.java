package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {

        File file = new File("doc\\test.txt");
        // 是否是文件
        System.out.println(file.isFile()); // true
        // 是否是文件夹
        System.out.println(file.isDirectory()); // false
        // 是否存在
        System.out.println(file.exists()); // true
        // 是否可执行
        System.out.println(file.canExecute()); // true
        // 是否可读
        System.out.println(file.canRead()); // true
        // 是否可写
        System.out.println(file.canWrite());// false
        // 是否隐藏
        System.out.println(file.isHidden());// true

        System.out.println("------------------");
        File file1 = new File("doc");
        System.out.println(file1.isFile()); // false
        System.out.println(file1.isDirectory()); // true


        // 是否可执行
        System.out.println(file1.canExecute()); // true
        // 是否可读
        System.out.println(file1.canRead()); // true
        // 是否可写
        System.out.println(file1.canWrite());// true
        // 是否隐藏
        System.out.println(file1.isHidden());// false

        System.out.println("----------------");

        File file2 = new File("html");
        // 判断文件或文件夹是否存在
        System.out.println(file2.exists()); // false
    }
}
