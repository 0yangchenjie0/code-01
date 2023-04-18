package com.bjpowernode.day17;

import java.io.File;

/**
 * 遍历文件夹及其所有子目录和子文件
 */
public class DiguiDemo04 {

    public static void main(String[] args) {
        f1("doc", 0);
    }


    /**
     * @param path 文件夹或文件的路径
     */
    public static void f1(String path, int level) {
        File file = new File(path);
        // 控制台输出文件的名字
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        System.out.println(file.getName());
        level++;

        if (file.isFile()) {
            return; // 递归的出口
        } else { // 如果是文件夹
            // 如果是目录，遍历该目录
            for (File f : file.listFiles()) {
                f1(f.getAbsolutePath(), level);
            }
        }
    }
}
