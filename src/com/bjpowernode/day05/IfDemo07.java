package com.bjpowernode.day05;
import java.util.Scanner;

/**
 *录入一个年份，判断其是否为闰年。
 *   闰年的计算方法：
 *    能被4整除，并且不能被100整除的年份是闰年；
 *    能被400整除的年份是闰年。
 */
public class IfDemo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 接受键盘输入的四位数年份
        System.out.print("请输入四位数的年份：");
        int year = scanner.nextInt();
        if (year > 999 && year < 10000) {
            // 能被4整除，并且不能被100整除的年份是闰年
            if ((year % 4 == 0) && (year % 100 !=0)) {
                System.out.println(year + " 是闰年");
            }
            // 能被400整除的年份是闰年
            else if (year % 400 == 0) {
                System.out.println(year + " 是闰年");
            }
            else {
                System.out.println(year + " 是平年");
            }
        } else {
            System.out.println("输入的年份不正确");
        }
    }
}


