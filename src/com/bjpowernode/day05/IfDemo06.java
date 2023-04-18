package com.bjpowernode.day05;
import java.util.Scanner;

/**
 * 输入一个整数 month 代表月份，根据月份输出对应的季节。
 *   春季：3、4、5
 *   夏季：6、7、8
 *   秋季：9、10、11
 *   冬季：12、1、2
 */
public class IfDemo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            // 如果if后的{}内只有一条语句，{} 可以省略
//            if (month >= 3 && month <= 5) System.out.println("春季");
//            else if (month >=6 && month <= 8) System.out.println("夏季");
//            else if (month >=9 && month <= 11) System.out.println("秋季");
//            else System.out.println("冬季");

            if (month == 3 || month == 4 || month == 5) {
                System.out.println("春季");
            }
            if (month == 6 || month == 7 || month == 8) {
                System.out.println("夏季");
            }
            if (month == 9 || month == 10 || month == 11) {
                System.out.println("秋季");
            }
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("冬季");
            }
        } else {
            System.out.println("输入的月份无效");
        }
    }
}



