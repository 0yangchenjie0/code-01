package com.bjpowernode.day06;

/**
 * break 用于switch 结构，提前结束switch语句，后续的case和default都不再执行
 */
public class BreakDemo01 {

    public static void main(String[] args) {
        char c = 'A';

        switch (c) {
            case 'A' : {
                System.out.println("A");
                break; // 提前结束switch语句
            }
            case 'B' : {
                System.out.println("B");
            }
            default: {
                System.out.println("default");
            }
        }
    }
}
