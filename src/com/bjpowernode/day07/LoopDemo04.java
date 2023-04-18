package com.bjpowernode.day07;
/*
打印平行四边形
      * * * *
    * * * *
  * * * *
* * * *
思路，每行先打印空格，再打印当前行 * 的个数
 */
public class LoopDemo04 {
    public static void main(String[] args) {
        // 外层循环控制行 输出4行
        for (int i = 1; i <= 4; i++) {
            // 第一个内层循环打印当前行的空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // 第二内层循环打印当前行的 * 的个数
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            // 换行
            System.out.println();
        }
    }
}