package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;

/**
 * 删除文件和文件夹
 *
 * 移动文件和文件夹
 */
public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("html\\day01");
        // 删除文件夹，空文件夹可以直接删除
        System.out.println(file1.delete());

        System.out.println("-------------");
        File file2 = new File("html\\day02");
        // 删除文件夹，如果文件夹下有内容，不能删除
        System.out.println(file2.delete());

        System.out.println("-------------");
        File file3 = new File("html\\day02\\1.html");
        System.out.println(file3.delete());


        System.out.println("-------------");
        // 移动文件夹或文件
        File file4 = new File("html\\day03\\1.html");
        boolean result = file4.renameTo(new File("html\\day03\\2.html"));
        System.out.println(result);

    }
}
