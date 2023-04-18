package com.bjpowernode.day07;

/*
打印矩形

* * * * * *
* * * * * *
* * * * * *
* * * * * *

规律：
外层循环控制多少行
内层循环控制每行的内容
 */
public class LoopDemo01 {

    public static void main(String[] args) {
        // 输出四行 * ，每行6个
        for (int j=0;j<=4;j++) {
            // 一行输出6个*
            for (int i=1;i<=6;i++) {
                // 每次循环输出一个 * 不换行
                System.out.print("* ");
            }
            // 每行 * 输出完成后换行
            System.out.println();
        }

    }
}
