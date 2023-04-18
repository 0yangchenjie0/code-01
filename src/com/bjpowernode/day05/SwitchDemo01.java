package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 需求数字 1-7 表示星期一到星期日
 * switch(表达式) {
 * case: 常量1 {
 * // 语句序列
 * [break;]
 * }
 * case: 常量2 {
 * // 语句序列
 * [break;]
 * }
 * [default:]
 * 默认语句;
 * [break;]
 * }
 * switch() 中的数据类型只能为：byte、short、int、char、String（JDK7）和枚举 (后面会学习)。
 * case 后面必须是常量，并且常量的类型应该和 switch() 中的数据类型保持一致。并且不允许有重复的 case 值。
 * break用于跳出switch语句，根据需求我们我们可以省略break，
 * 如果没有 break, 一旦进入 case，导致后面的所有 case 都能进入，直到遇到 break 或 switch 结束。
 * default 可以省略，但是最好不要省略，除非 case 能匹配所有的可能性。
 * case 和 default 是无序的，不过 default 只能最后执行或不执行。
 * <p>
 * 建议：
 * 一个case处理一种情况，建议每个 case和default 都添加break语句
 * default 放到最后面
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1-7的整数：");
        int week = scanner.nextInt();
        switch (week) {
            case 1: {
                System.out.println("星期一");
                break;
            }
            case 2: {
                System.out.println("星期二");
                break;
            }
            case 3: {
                System.out.println("星期三");
                break;
            }
            case 4: {
                System.out.println("星期四");
                break;
            }
            case 5: {
                System.out.println("星期五");
                break;
            }
            case 6: {
                System.out.println("星期六");
                break;
            }
            case 7: {
                System.out.println("星期日");
                break;
            }
            default: {
                System.out.println("输入的数字错误");
                break;
            }
        }
    }
}
