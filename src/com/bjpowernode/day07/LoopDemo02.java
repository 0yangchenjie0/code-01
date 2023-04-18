package com.bjpowernode.day07;

/*
打印三角形

*
* *
* * *
* * * *

 * 外层循环控制行 4
 * 内层循环输出当前行的内容
 * 每行输出*的个数是行号
 */
public class LoopDemo02 {
    public static void main(String[] args) {
        // 外层循环循环4次，每次输出一行内容
        for (int i = 1; i <= 4; i++) {
            // 内层循环输出每一行的 *  每一行应该输出多少个 *
            for (int j = 1; j <= i; j++) {
                // 每次循环输出一个 *
                System.out.print("* ");
            }
            // 换行
            System.out.println();
        }
    }
}
/**
 * 外层第一次循环 i=1
 *    for (int j = 1; j <= 1; j++)
 *    内层循环循环 1次  输出 *
 * 执行 i++
 * 输出换行
 *
 * 外层第二次循环 i=2
 *    for (int j = 1; j <= 2; j++)
 *    内层循环循环 2次  输出 * *
 * 执行 i++
 * 输出换行
 *
 * 外层第三次循环 i=3
 *    for (int j = 1; j <= 3; j++)
 *    内层循环循环 3次  输出 * * *
 * 执行 i++
 * 输出换行
 *
 * 外层第四次循环 i=4
 *    for (int j = 1; j <= 4; j++)
 *    内层循环循环 4次  输出 * * * *
 * 执行 i++  5
 * 输出换行
 *
 * 外层第五次循环，不满足 i<=4的循环条件，结束外层循环
 *
 *
 */