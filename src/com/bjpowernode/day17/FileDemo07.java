package com.bjpowernode.day17;

import java.io.File;
import java.io.IOException;

/**
 * 遍历 html 目录下的所有文件夹和文件
 */
public class FileDemo07 {
    public static void main(String[] args) throws IOException {

        File file = new File("html"); // 根
        String[] filenames = file.list();
        // 一级目录
        for (String filename : filenames) {
            System.out.println(filename);
            File f1 = new File(file,filename);

            // 二级目录
            String[] arr = f1.list();
            for (String s1 : arr) {
                System.out.println("\t" +s1);

                // 三级目录

            }
        }
    }
}
