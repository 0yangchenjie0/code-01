package com.bjpowernode.day07;

/*
打印三角形

      *
    * *
  * * *
* * * *

 */
public class LoopDemo05 {
    public static void main(String[] args) {
        // 外层循环控制行 输出4行
        for (int i = 1; i <= 4; i++) {
            // 第一个内层循环打印当前行的空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // 第二个内层循环输出每一行 *
            for (int j = 1; j <= i; j++) {
                // 每次循环输出一个 *
                System.out.print("* ");
            }
            // 换行
            System.out.println();
        }
    }
}