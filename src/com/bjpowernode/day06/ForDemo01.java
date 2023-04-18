package com.bjpowernode.day06;

/**
 * for(循环初始化表达式; 循环条件表达式; 循环后的操作表达式) {
 *     // 循环体
 * }
 */
public class ForDemo01 {
    public static void main(String[] args) {
        int i = 1;
        for(;i<=3;) {
            System.out.println("Hello World");
            i++;
        }
        System.out.println("程序结束...");
    }
}
// 第一次循环，i==1，满足 i<=3 的条件，执行for中语句 System.out.println("Hello World"); 2
// 第二次循环，i==2，满足 i<=3 的条件，执行for中语句 System.out.println("Hello World"); 3
// 第三次循环，i==3，满足 i<=3 的条件，执行for中语句 System.out.println("Hello World"); 4
// 第四次循环，i==4,不满足i<=3 的条件，不再执行for中的语句，循环结束，程序继续向下执行
