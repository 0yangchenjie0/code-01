package com.bjpowernode.day06;

/**
 * for(循环初始化表达式; 循环条件表达式; 循环后的操作表达式) {
 * // 循环体
 * }
 * <p>
 * 注意：循环初始化表达式只执行一次。
 */
public class ForDemo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello World");
        }
        System.out.println("程序结束...");
    }
}
/**
 * for (1; 2; 3) {
 * 4
 * }
 * 5
 * 第一次循环，执行 1，（int i = 1），执行 2 （i<=3 成立），执行 4（System.out.println("Hello World");），执行 3（i++） 2
 * 第二次循环，执行 2,(i<=3) 成立，执行4，执行 3（i++）3
 * 第三次循环，执行 2,(i<=3) 成立，执行4，执行 3（i++）4
 * 第四次循环，执行 2,(i<=3) 不成立，结束循环，继续执行后续代码
 */
