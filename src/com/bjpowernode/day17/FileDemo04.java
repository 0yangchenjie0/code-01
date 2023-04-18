package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件和文件夹
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("html");
        // 创建文件夹,不能创建嵌套的文件夹
        System.out.println(file1.mkdir());

        File file2 = new File("html\\day01");
        System.out.println(file2.mkdir());

        File file3 = new File("html\\day02\\笔记");
        // 创建文件或目录的同时，如果父级目录不存在，先创建父级目录
        System.out.println(file3.mkdirs());

        System.out.println("--------------------------");
        // 创建文件
        File file4 = new File("html\\day02\\1.html");
        System.out.println(file4.createNewFile());

        System.out.println("--------------------------");
        // 创建文件
        //File file5 = new File("html\\day03\\1.html");
        //System.out.println(file4.createNewFile());

        File file5 = new File("html\\day03");
        // 如果路径不存在
        if (!file5.exists()) {
            file5.mkdirs();
        }
        File file6 = new File(file5,"1.html"); // html\\day03\\1.html
        // 创建文件
        file6.createNewFile();
    }
}
