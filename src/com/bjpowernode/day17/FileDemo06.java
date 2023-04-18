package com.bjpowernode.day17;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * 删除文件和文件夹
 *
 * 移动文件和文件夹
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        File file = new File("doc");

        // 获取当前目录下所有文件和文件夹的名称
        String[] arr = file.list();
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");

        // 获取到当前目录下所有的文件和文件夹对于的file对象
//        File[] files = file.listFiles();
//        for (File f : files) {
//            System.out.println(f.getName());
//        }

        // 过滤文件夹,只返回子文件夹
        String[] arr1 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File f, String name) {
                return !name.equals("test.txt");
            }
        });
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------");

        File[] arr2 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                // 只返回目录，不返回文件
                return f.isDirectory();
            }
        });
        for (File f : arr2) {
            System.out.print(f.getName() + " ");
        }
    }
}
