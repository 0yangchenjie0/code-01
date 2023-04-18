package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 输入时（hour）、分（minute）、秒（second）的一个具体时间，要求打印出它的下一秒出来（一天24小时）。
 * <p>
 * 例如输入 23时 59分 59秒，则输出 00:00:00；
 * 例如输入 17时 09分 59秒，则输出17:10:00。
 */
public class IfDemo08 {
    public static void main(String[] args) {
        //1.从键盘接受一个时分秒的具体时间
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入小时：");
        int hour = scanner.nextInt(); // 0-23 0-9
        System.out.print("请输入分钟：");
        int minute = scanner.nextInt();//0-59
        System.out.print("请输入秒数：");
        int second = scanner.nextInt();
        second++; // 获取到下一秒 50 51  59  00
        if (second == 60) {
            second = 0; // 秒设置成0秒
            minute++; // 分钟增加一分钟  55 56  59
            if (minute == 60) {
                minute = 0; // 分钟设置成0分钟
                hour++; // 小时增加一小时 22 23 24
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        // 格式化输出时间 HH:mm:ss
        String hourStr = hour + "";
        String minuteStr = minute + "";
        String secondStr = second + "";
        // 如果小时是一位数字，前面补0
        if (hour >= 0 && hour < 10) {
            hourStr = "0" + hourStr;
        }
        // 如果分钟是一位数字，前面补0
        if (minute >= 0 && minute < 10) {
            minuteStr = "0" + minuteStr;
        }
        // 如果秒是一位数字，前面补0
        if (second >= 0 && second < 10) {
            secondStr = "0" + secondStr;
        }
        System.out.println(hourStr + ":" + minuteStr + ":" + secondStr);
    }
}
