package com.bjpowernode.day07;

/*
打印倒三角形
         i
* * * *  1  4
* * *    2  3
* *      3  2
*        4  1


外层循环控制行 4
内层循环输出当前行的内容
每行输出*的个数是行号
 */
public class LoopDemo03 {
    public static void main(String[] args) {
        // 外层循环控制行 输出4行
        for (int i = 1; i <= 4; i++) {
            // 内层循环输出当前行的 * 的个数
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("* ");
            }



//            for (int j = 5 - i; j >= 1; j--) {
//                System.out.print("* ");
//            }
            // 换行
            System.out.println();
        }
    }
}